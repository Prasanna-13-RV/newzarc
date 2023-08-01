package com.newzarc.newzarcapp.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource
import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.post.PostEntity
import com.newzarc.newzarcapp.domain.repository.PostsRepository
import retrofit2.Response

class PostsRepositoryImpl(
    private val postsRemoteDataSource: PostsRemoteDataSource
) : PostsRepository {
    override suspend fun getAllPosts(): List<PostEntity> {
        return getPostsFromApi()
    }

    override suspend fun getMyPosts(user_id: String): List<MyPostEntity>? {
        return getMyPostsFromApi(user_id)
    }

    override suspend fun createPost(post: MyPostEntity): Response<MyPostEntity> {

        var createdList: MutableLiveData<Response<MyPostEntity>> = MutableLiveData()

        val response = postsRemoteDataSource.createPosts(post)
        createdList.value = response

        return response

    }

    private suspend fun getPostsFromApi(): List<PostEntity> {
//        var postList: List<PostEntity>? = null

        lateinit var postList: List<PostEntity>

        try {
            val response = postsRemoteDataSource.getAllPosts()
            val body = response.body()

//            Log.d("viewmodelimpl", body.toString())

            if (body != null) {
                postList = body
//                Log.d("viewmodelimpl", postList.toString())
            }
        } catch (exception: Exception) {
            postList = emptyList()
            Log.d("viewmodelimplerr", exception.toString())
        }
        return postList
    }


    private suspend fun getMyPostsFromApi(user_id: String): List<MyPostEntity> {
//        var postList: List<MyPostEntity>? = null

        lateinit var postList: List<MyPostEntity>

        try {
            val response = postsRemoteDataSource.getMyPosts(user_id)
            val body = response.body()

            Log.d("Myviewmypostimpbody", body.toString())

            if (body != null) {
                postList = body
                Log.d("Myviewmypostimp", postList.toString())
            }
        } catch (exception: Exception) {
            postList = emptyList()
            Log.d("mypostimperr", exception.toString())
        }
        return postList
    }

}

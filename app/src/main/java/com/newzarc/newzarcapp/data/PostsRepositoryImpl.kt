package com.newzarc.newzarcapp.data

import android.util.Log
import com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource
import com.newzarc.newzarcapp.data.model.PostEntity
import com.newzarc.newzarcapp.domain.repository.PostsRepository

class PostsRepositoryImpl(
    private val postsRemoteDataSource: PostsRemoteDataSource
) : PostsRepository {
    override suspend fun getAllPosts(): List<PostEntity> {
        return getPostsFromApi()
    }

    private suspend fun getPostsFromApi(): List<PostEntity> {
//        var postList: List<PostEntity>? = null

        lateinit var postList: List<PostEntity>

        try {
            val response = postsRemoteDataSource.getAllPosts()
            val body = response.body()

            Log.d("viewmodelimpl", body.toString())

            if (body != null) {
                postList = body
                Log.d("viewmodelimpl", postList.toString())
            }
        } catch (exception: Exception) {
            postList = emptyList()
            Log.d("viewmodelimplerr", exception.toString())
        }
        return postList
    }
}

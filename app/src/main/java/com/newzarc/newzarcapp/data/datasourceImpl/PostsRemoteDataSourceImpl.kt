package com.newzarc.newzarcapp.data.datasourceImpl

import com.newzarc.newzarcapp.data.api.PostService
import com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource
import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.mypost.MyPostList
import com.newzarc.newzarcapp.data.model.post.PostList
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class PostsRemoteDataSourceImpl @Inject constructor(
    private val postService: PostService
) : PostsRemoteDataSource {

    override suspend fun getAllPosts(): Response<PostList> =
        postService.getAllPosts()

    override suspend fun getMyPosts(user_id: String): Response<MyPostList> =
        postService.getMyPosts(user_id)

    override suspend fun createPosts(post: MyPostEntity): Response<MyPostEntity> =
        postService.createPost(post)

}

package com.newzarc.newzarcapp.data.datasourceImpl

import com.newzarc.newzarcapp.data.api.NewsService
import com.newzarc.newzarcapp.data.api.PostService
import com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource
import com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource
import com.newzarc.newzarcapp.data.model.NewsList
import com.newzarc.newzarcapp.data.model.PostList
import com.newzarc.newzarcapp.utils.Contants.Companion.API_KEY
import retrofit2.Response
import javax.inject.Inject

class PostsRemoteDataSourceImpl @Inject constructor(
    private val postService: PostService
) : PostsRemoteDataSource {

    override suspend fun getAllPosts(): Response<PostList> =
        postService.getAllPosts()

}
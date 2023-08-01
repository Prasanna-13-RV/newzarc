package com.newzarc.newzarcapp.data.datasource

import com.newzarc.newzarcapp.data.model.PostList
import retrofit2.Response

interface PostsRemoteDataSource {
    suspend fun getAllPosts() : Response<PostList>
}
package com.newzarc.newzarcapp.data.datasource

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.mypost.MyPostList
import com.newzarc.newzarcapp.data.model.post.PostList
import retrofit2.Response

interface PostsRemoteDataSource {
    suspend fun getAllPosts() : Response<PostList>
    suspend fun getMyPosts(user_id : String) : Response<MyPostList>

    suspend fun createPosts(post : MyPostEntity) : Response<MyPostEntity>

}
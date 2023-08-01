package com.newzarc.newzarcapp.domain.repository

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.mypost.MyPostList
import com.newzarc.newzarcapp.data.model.news.NewsEntity
import com.newzarc.newzarcapp.data.model.post.PostEntity
import retrofit2.Response

interface PostsRepository {

    suspend fun getAllPosts(): List<PostEntity>?

    suspend fun getMyPosts(user_id: String): List<MyPostEntity>?

    suspend fun createPost(post: MyPostEntity): Response<MyPostEntity>


}


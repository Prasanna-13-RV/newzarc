package com.newzarc.newzarcapp.domain.repository

import com.newzarc.newzarcapp.data.model.NewsEntity
import com.newzarc.newzarcapp.data.model.PostEntity

interface PostsRepository {

    suspend fun getAllPosts() : List<PostEntity>?
}
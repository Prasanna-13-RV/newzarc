package com.newzarc.newzarcapp.domain.usecase

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.domain.repository.PostsRepository
import retrofit2.Response

class PostCreateUseCase(private val postsRepository: PostsRepository) {

    suspend fun execute(post: MyPostEntity): Response<MyPostEntity>? {
        return postsRepository.createPost(post)
    }

}
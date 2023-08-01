package com.newzarc.newzarcapp.domain.usecase

import com.newzarc.newzarcapp.data.model.PostEntity
import com.newzarc.newzarcapp.domain.repository.PostsRepository

class GetPostsUseCase(private val postsRepository: PostsRepository) {

    suspend fun execute() : List<PostEntity>? {
        return postsRepository.getAllPosts()
    }
}
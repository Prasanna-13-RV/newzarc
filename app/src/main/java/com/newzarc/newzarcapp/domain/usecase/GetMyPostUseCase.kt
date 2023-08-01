package com.newzarc.newzarcapp.domain.usecase

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.post.PostEntity
import com.newzarc.newzarcapp.domain.repository.PostsRepository

class GetMyPostUseCase(private val postsRepository: PostsRepository) {

    suspend fun execute(user_id : String): List<MyPostEntity>? {
        return postsRepository.getMyPosts(user_id)
    }
}
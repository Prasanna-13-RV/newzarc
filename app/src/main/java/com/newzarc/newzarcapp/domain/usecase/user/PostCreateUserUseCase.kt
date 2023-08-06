package com.newzarc.newzarcapp.domain.usecase.user

import com.newzarc.newzarcapp.data.model.user.UserEntity
import com.newzarc.newzarcapp.domain.repository.UserRepository
import retrofit2.Response

class PostCreateUserUseCase(
    private val userRepository: UserRepository
) {

    suspend fun execute(user : UserEntity) : Response<UserEntity>? {
        return userRepository.createUser(user)
    }
}
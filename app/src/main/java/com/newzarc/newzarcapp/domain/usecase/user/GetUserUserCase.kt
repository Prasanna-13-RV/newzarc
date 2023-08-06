package com.newzarc.newzarcapp.domain.usecase.user

import com.newzarc.newzarcapp.data.model.user.UserEntity
import com.newzarc.newzarcapp.domain.repository.UserRepository

class GetUserUserCase(
    private val userRepository: UserRepository
) {
    suspend fun execute(email : String) : List<UserEntity>? {
        return userRepository.getUser(email)
    }
}
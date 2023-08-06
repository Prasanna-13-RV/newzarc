package com.newzarc.newzarcapp.domain.repository

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.user.UserEntity
import retrofit2.Response

interface UserRepository {

    suspend fun getUser(email: String): List<UserEntity>?

    suspend fun createUser(user: UserEntity): Response<UserEntity>?


}
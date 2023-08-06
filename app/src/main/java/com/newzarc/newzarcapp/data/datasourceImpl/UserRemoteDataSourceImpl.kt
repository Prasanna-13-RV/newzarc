package com.newzarc.newzarcapp.data.datasourceImpl

import com.newzarc.newzarcapp.data.api.UserService
import com.newzarc.newzarcapp.data.datasource.UserRemoteDataSource
import com.newzarc.newzarcapp.data.model.user.UserEntity
import com.newzarc.newzarcapp.data.model.user.UserList
import retrofit2.Response

class UserRemoteDataSourceImpl(
    private val userService: UserService
) : UserRemoteDataSource {
    override suspend fun getUser(email: String): Response<UserList> {
        return userService.getUser(email)
    }

    override suspend fun createUser(user: UserEntity): Response<UserEntity> {
        return userService.createUser(user)
    }
}
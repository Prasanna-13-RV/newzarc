package com.newzarc.newzarcapp.data.datasource

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.mypost.MyPostList
import com.newzarc.newzarcapp.data.model.user.UserEntity
import com.newzarc.newzarcapp.data.model.user.UserList
import retrofit2.Response

interface UserRemoteDataSource {

    suspend fun getUser(email : String) : Response<UserList>

    suspend fun createUser(user : UserEntity) : Response<UserEntity>

}
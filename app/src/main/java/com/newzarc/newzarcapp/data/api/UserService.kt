package com.newzarc.newzarcapp.data.api

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.mypost.MyPostList
import com.newzarc.newzarcapp.data.model.user.UserEntity
import com.newzarc.newzarcapp.data.model.user.UserList
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UserService {

    @GET("user/email/{email}")
    suspend fun getUser(
        @Path("email") userId : String
    ) : Response<UserList>

    @POST("user/create")
    suspend fun createUser(@Body post : UserEntity): Response<UserEntity>


}
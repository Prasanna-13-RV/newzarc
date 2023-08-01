package com.newzarc.newzarcapp.data.api

import com.newzarc.newzarcapp.data.model.PostList
import retrofit2.Response
import retrofit2.http.GET

interface PostService {

//    @GET("https://newzarc-server.onrender.com/api/posts/")
    @GET("http://172.16.9.168:8080/api/allposts")
    suspend fun getAllPosts() : Response<PostList>
}
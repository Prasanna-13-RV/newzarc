package com.newzarc.newzarcapp.data.api

import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.mypost.MyPostList
import com.newzarc.newzarcapp.data.model.post.PostList
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface PostService {

//    @GET("https://newzarc-server.onrender.com/api/posts/")
    @GET("http://192.168.1.15:8080/api/allposts")
    suspend fun getAllPosts() : Response<PostList>

    @GET("http://192.168.1.15:8080/api/post/user/{id}")
    suspend fun getMyPosts(
        @Path("id") userId : String
    ) : Response<MyPostList>


    @POST("http://192.168.1.15:8080/api/post/create")
    suspend fun createPost(@Body post : MyPostEntity): Response<MyPostEntity>


}
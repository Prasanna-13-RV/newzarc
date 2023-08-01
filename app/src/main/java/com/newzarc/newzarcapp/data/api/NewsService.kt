package com.newzarc.newzarcapp.data.api

import com.newzarc.newzarcapp.data.model.NewsList
import com.newzarc.newzarcapp.utils.Contants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("news")
    suspend fun getAllNews(
        @Query(
            "apikey"
        ) apiKey: String,
    ): Response<NewsList>
}

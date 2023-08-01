package com.newzarc.newzarcapp.data.datasource

import com.newzarc.newzarcapp.data.model.news.NewsList
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getAllNews() : Response<NewsList>

}
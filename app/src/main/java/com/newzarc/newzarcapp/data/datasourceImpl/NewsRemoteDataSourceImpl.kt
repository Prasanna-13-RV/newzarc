package com.newzarc.newzarcapp.data.datasourceImpl

import com.newzarc.newzarcapp.data.api.NewsService
import com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource
import com.newzarc.newzarcapp.data.model.news.NewsList
import com.newzarc.newzarcapp.utils.Contants.Companion.API_KEY
import retrofit2.Response
import javax.inject.Inject

class NewsRemoteDataSourceImpl @Inject constructor(
    private val newsService: NewsService,
    private val apiKey: String
) : NewsRemoteDataSource {

    override suspend fun getAllNews(): Response<NewsList> =
        newsService.getAllNews(API_KEY)
//    newsService.getAllNews()
}
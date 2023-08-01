package com.newzarc.newzarcapp.data.datasource


import com.newzarc.newzarcapp.data.model.news.NewsEntity

interface NewsCacheDataSource {

    suspend fun getNewsFromCache() : List<NewsEntity>

    suspend fun saveNewsFromCache(news : List<NewsEntity>)

}
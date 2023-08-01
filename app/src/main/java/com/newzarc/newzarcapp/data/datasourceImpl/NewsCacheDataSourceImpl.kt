package com.newzarc.newzarcapp.data.datasourceImpl

import com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource
import com.newzarc.newzarcapp.data.model.NewsEntity

class NewsCacheDataSourceImpl : NewsCacheDataSource {

    private var newsList = ArrayList<NewsEntity>()

    override suspend fun getNewsFromCache(): List<NewsEntity> {
        return newsList
    }

    override suspend fun saveNewsFromCache(news: List<NewsEntity>) {
        newsList.clear()
        newsList = ArrayList(news)
    }
}
package com.newzarc.newzarcapp.data.datasource

import com.newzarc.newzarcapp.data.model.NewsEntity

interface NewsLocalDataSource {

    suspend fun getNewsFromDb() : List<NewsEntity>

    suspend fun saveNewsFromDb(news : List<NewsEntity>)

    suspend fun clearDb()
}
package com.newzarc.newzarcapp.data.datasourceImpl

import com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource
import com.newzarc.newzarcapp.data.db.NewsDao
import com.newzarc.newzarcapp.data.model.news.NewsEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsLocalDataSourceImpl(private val newsDao: NewsDao) : NewsLocalDataSource {

    override suspend fun getNewsFromDb(): List<NewsEntity> {
        return newsDao.getAllNews()
    }

    override suspend fun saveNewsFromDb(news: List<NewsEntity>) {
        CoroutineScope(Dispatchers.IO).launch {
            newsDao.saveNews(news)
        }
    }

    override suspend fun clearDb() {
        CoroutineScope(Dispatchers.IO).launch {
            newsDao.deleteNews()
        }
    }
}
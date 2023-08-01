package com.newzarc.newzarcapp.data

import android.util.Log
import com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource
import com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource
import com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource
import com.newzarc.newzarcapp.data.model.NewsEntity
import com.newzarc.newzarcapp.domain.repository.NewsRepository

class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource,
    private val newsLocalDataSource: NewsLocalDataSource,
    private val newsCacheDataSource: NewsCacheDataSource
) : NewsRepository {
    override suspend fun getAllNews(): List<NewsEntity>? {
//        return getNewsFromCache()
        return getNewsFromApi()
    }

    override suspend fun updateNews(): List<NewsEntity>? {
        val newListOfNews = getNewsFromApi()
        newsLocalDataSource.clearDb()
        newsLocalDataSource.saveNewsFromDb(newListOfNews)
        newsCacheDataSource.saveNewsFromCache(newListOfNews)

        return newListOfNews
    }


    private suspend fun getNewsFromCache(): List<NewsEntity>? {
//        lateinit var newsList: List<NewsEntity>
        var newsList : List<NewsEntity> ?= null

        try {
            newsList = newsLocalDataSource.getNewsFromDb()
        } catch (exception: Exception) {
            Log.d("NewsRepositoryImpl", exception.toString())
        }
        if (newsList?.isNotEmpty() == true) {
            return newsList
        } else {
            newsList = getNewsFromRoom()
            newsCacheDataSource.saveNewsFromCache(newsList)
        }
        return newsList
    }

    private suspend fun getNewsFromRoom(): List<NewsEntity> {
        var newsList: List<NewsEntity> ?= null

        try {
            newsList = newsLocalDataSource.getNewsFromDb()
        } catch (exception: Exception) {
            Log.d("NewsRepositoryImpl", exception.toString())
        }

        if (newsList?.isNotEmpty() == true) {
            return newsList
        } else {
            newsList = getNewsFromApi()
            newsLocalDataSource.saveNewsFromDb(newsList)
        }
        return newsList
    }

    private suspend fun getNewsFromApi(): List<NewsEntity> {
        var newsList: List<NewsEntity>? = null

        try {
            val response = newsRemoteDataSource.getAllNews()
            val body = response.body()

            Log.d("NewsRepositoryImpl", body.toString())

            if (body != null) {
                newsList = body.results
                Log.d("NewsRepositoryImpl", newsList.toString())
            }
        } catch (exception: Exception) {
            Log.d("NewsRepositoryImplerr", exception.toString())
        }
        return newsList!!
    }

}
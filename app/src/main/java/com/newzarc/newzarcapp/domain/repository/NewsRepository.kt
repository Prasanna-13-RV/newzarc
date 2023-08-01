package com.newzarc.newzarcapp.domain.repository

import com.newzarc.newzarcapp.data.model.news.NewsEntity

interface NewsRepository {

    suspend fun getAllNews() : List<NewsEntity>?
    suspend fun updateNews() : List<NewsEntity>?

}
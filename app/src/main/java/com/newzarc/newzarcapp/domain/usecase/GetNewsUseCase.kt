package com.newzarc.newzarcapp.domain.usecase

import android.util.Log
import com.newzarc.newzarcapp.data.model.NewsEntity
import com.newzarc.newzarcapp.domain.repository.NewsRepository

class GetNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute() : List<NewsEntity>? {
        return newsRepository.getAllNews()
    }
}
package com.newzarc.newzarcapp.domain.usecase

import com.newzarc.newzarcapp.data.model.NewsEntity
import com.newzarc.newzarcapp.domain.repository.NewsRepository

class UpdateNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute() : List<NewsEntity>? = newsRepository.updateNews()
}
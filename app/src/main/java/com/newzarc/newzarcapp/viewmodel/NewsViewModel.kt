package com.newzarc.newzarcapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase
import com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase
import com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val getNewsUseCase: GetNewsUseCase,
    private val updateNewsUseCase: UpdateNewsUseCase,
    private val getPostsUseCase: GetPostsUseCase
) : ViewModel() {

    fun getNews() = liveData {
        val newsList = getNewsUseCase.execute()
//        Log.d("Myview", "Hrllo")
        emit(newsList)
    }

    fun updateNews() = liveData {
        val newsList = updateNewsUseCase.execute()
        emit(newsList)
    }

    fun getPosts() = liveData {
        val postsList = getPostsUseCase.execute()
//        Log.d("Myview", "Hrllo")
        emit(postsList)
    }


}
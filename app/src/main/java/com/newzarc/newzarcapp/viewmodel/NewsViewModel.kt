package com.newzarc.newzarcapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase
import com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase
import com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase
import com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase
import com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val getNewsUseCase: GetNewsUseCase,
    private val updateNewsUseCase: UpdateNewsUseCase,
    private val getPostsUseCase: GetPostsUseCase,
    private val getMyPostUseCase: GetMyPostUseCase,
    private val postCreateUseCase: PostCreateUseCase
) : ViewModel() {

    fun getNews() = liveData {
        val newsList = getNewsUseCase.execute()
        emit(newsList)
    }

    fun updateNews() = liveData {
        val newsList = updateNewsUseCase.execute()
        emit(newsList)
    }

    fun getPosts() = liveData {
        val postsList = getPostsUseCase.execute()
        emit(postsList)
    }

    fun getMyPosts(user_id: String) = liveData {
        val postsList = getMyPostUseCase.execute(user_id)
//        Log.d("Myviewget", "Hrllo")
//        Log.d("Myviewget", postsList.toString())
        emit(postsList)
    }

    fun createPost(post: MyPostEntity) {
        viewModelScope.launch {
            val createPost = postCreateUseCase.execute(post)
        }
    }

}
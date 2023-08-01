package com.newzarc.newzarcapp.di

import com.newzarc.newzarcapp.data.api.NewsService
import com.newzarc.newzarcapp.data.api.PostService
import com.newzarc.newzarcapp.utils.Contants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetModule() {

    @Singleton
    @Provides
    fun providesRetrofit() : Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
//            .baseUrl("https://newsdata.io/api/1/news/")
            .build()
    }

    @Singleton
    @Provides
    fun providesNewsService(retrofit: Retrofit) : NewsService {
        return retrofit.create(NewsService::class.java)
    }

    @Singleton
    @Provides
    fun providesPostsService(retrofit: Retrofit) : PostService {
        return retrofit.create(PostService::class.java)
    }
}
package com.newzarc.newzarcapp.di

import com.newzarc.newzarcapp.data.api.NewsService
import com.newzarc.newzarcapp.data.api.PostService
import com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource
import com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource
import com.newzarc.newzarcapp.data.datasourceImpl.NewsRemoteDataSourceImpl
import com.newzarc.newzarcapp.data.datasourceImpl.PostsRemoteDataSourceImpl
import com.newzarc.newzarcapp.utils.Contants.Companion.API_KEY
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsDataSource(newsService: NewsService) : NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(
            newsService,
            API_KEY
        )
    }

    @Singleton
    @Provides
    fun providePostsDataSource(postService: PostService) : PostsRemoteDataSource {
        return PostsRemoteDataSourceImpl(postService)
    }
}
package com.newzarc.newzarcapp.di

import com.newzarc.newzarcapp.data.NewsRepositoryImpl
import com.newzarc.newzarcapp.data.PostsRepositoryImpl
import com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource
import com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource
import com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource
import com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource
import com.newzarc.newzarcapp.domain.repository.NewsRepository
import com.newzarc.newzarcapp.domain.repository.PostsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun providesNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource,
        newsCacheDataSource: NewsCacheDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource, newsLocalDataSource, newsCacheDataSource)
    }

    @Singleton
    @Provides
    fun providesPostsRepository(
        postsRemoteDataSource: PostsRemoteDataSource
    ): PostsRepository {
        return PostsRepositoryImpl(postsRemoteDataSource)
    }


}
package com.newzarc.newzarcapp.di

import com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource
import com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource
import com.newzarc.newzarcapp.data.datasourceImpl.NewsLocalDataSourceImpl
import com.newzarc.newzarcapp.data.db.NewsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun providesNewsLocalDataSource(newsDao: NewsDao) : NewsLocalDataSource{
        return NewsLocalDataSourceImpl(newsDao)
    }

}
package com.newzarc.newzarcapp.di

import com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource
import com.newzarc.newzarcapp.data.datasourceImpl.NewsCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CacheDataModule {

    @Singleton
    @Provides
    fun providesNewsCacheDataSource() : NewsCacheDataSource {
        return NewsCacheDataSourceImpl()

    }

}
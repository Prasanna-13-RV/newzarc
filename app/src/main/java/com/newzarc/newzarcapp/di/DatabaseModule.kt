package com.newzarc.newzarcapp.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.newzarc.newzarcapp.data.db.NewsDao
import com.newzarc.newzarcapp.data.db.NewsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun providesNewsDatabase(context : Application) : NewsDatabase {
        return Room.databaseBuilder(context.applicationContext,
        NewsDatabase::class.java,
        "newsdatabase").build()
    }

    @Singleton
    @Provides
    fun provideNewsDao(newsDatabase: NewsDatabase) : NewsDao {
        return newsDatabase.newsDao()
    }

}
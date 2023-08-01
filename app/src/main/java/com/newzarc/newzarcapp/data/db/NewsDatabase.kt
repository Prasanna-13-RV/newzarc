package com.newzarc.newzarcapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.newzarc.newzarcapp.data.model.news.NewsEntity

@Database(entities = [NewsEntity::class], version = 3, exportSchema = false)
abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsDao() : NewsDao

}
package com.newzarc.newzarcapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.newzarc.newzarcapp.data.model.NewsEntity

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveNews(news : List<NewsEntity>)

    @Query("DELETE FROM NewsEntity")
    suspend fun deleteNews()

    @Query("SELECT * FROM NewsEntity")
    suspend fun getAllNews() : List<NewsEntity>

}
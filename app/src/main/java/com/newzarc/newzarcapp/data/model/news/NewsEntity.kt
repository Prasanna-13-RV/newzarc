package com.newzarc.newzarcapp.data.model.news

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import javax.annotation.processing.Generated

@Parcelize
@Entity
data class NewsEntity(
//    val category: List<String>,
    @PrimaryKey(autoGenerate = true)
    val id_news : Int,
    val content: String,
    val description: String,
    var image_url: String?,
    val link: String,
    val pubDate: String,
    val title: String,
    var video_url: String = ""
) : Parcelable
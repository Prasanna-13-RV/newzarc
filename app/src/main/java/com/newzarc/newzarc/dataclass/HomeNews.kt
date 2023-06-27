package com.newzarc.newzarc.dataclass

import android.os.Parcel
import android.os.Parcelable

data class HomeNews(
    val id : Int,
    val title: String,
    val description: String,
    val content: String,
    val pubDate: String,
    val image_url: String,
    val videoUrl : String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeString(content)
        parcel.writeString(pubDate)
        parcel.writeString(image_url)
        parcel.writeString(videoUrl)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HomeNews> {
        override fun createFromParcel(parcel: Parcel): HomeNews {
            return HomeNews(parcel)
        }

        override fun newArray(size: Int): Array<HomeNews?> {
            return arrayOfNulls(size)
        }
    }
}
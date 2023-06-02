package com.newzarc.newzarc.dataclass

import android.os.Parcel
import android.os.Parcelable

data class NewsApi(
    val title: String,
    val link: String,
    val description: String,
    val content: String,
    val pubDate: String,
    val image_url: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(link)
        parcel.writeString(description)
        parcel.writeString(content)
        parcel.writeString(pubDate)
        parcel.writeString(image_url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NewsApi> {
        override fun createFromParcel(parcel: Parcel): NewsApi {
            return NewsApi(parcel)
        }

        override fun newArray(size: Int): Array<NewsApi?> {
            return arrayOfNulls(size)
        }
    }
}
package com.newzarc.newzarcapp.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class NewzarcApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
package com.newzarc.newzarcapp.views.screens.components

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.newzarc.newzarcapp.R
import kotlin.random.Random

fun NotificationFunction(
    context: Context,
    title: String,
    text: String
) {
    val notificationManager = context.getSystemService(NotificationManager::class.java)

    val notification = NotificationCompat.Builder(context, "newzarc")
        .setContentTitle(title)
        .setContentText(text)
        .setSmallIcon(R.drawable.ic_launcher_background)
        .setPriority(NotificationCompat.PRIORITY_HIGH)
        .setAutoCancel(true)
        .build()

    notificationManager.notify(
        Random.nextInt(),
        notification
    )

}
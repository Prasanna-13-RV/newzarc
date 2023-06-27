package com.newzarc.newzarc.ui.client

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.core.app.NavUtils
import com.bumptech.glide.Glide
import com.newzarc.newzarc.R
import com.newzarc.newzarc.dataclass.HomeNews
import com.newzarc.newzarc.dataclass.UserNews

class UserVideoDetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_video_detailed)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);

        val intent = intent
        val news = intent.getParcelableExtra<HomeNews>("message")

        title = if(news?.title?.length!! > 20) {
            news.title.substring(0, 20) + "..."
        } else {
            news.title
        }


        if (news != null) {
            val title: TextView = findViewById(R.id.newsTitle)
//            val content: TextView = findViewById(R.id.newsContent)
            val description: TextView = findViewById(R.id.newsDescription)
            val pubDate: TextView = findViewById(R.id.newsPubDate)
            val newsContent: TextView = findViewById(R.id.newsContent)
            val videoUrl: VideoView = findViewById(R.id.newsVideo)

            title.text = news.title
//            content.text = news.content
            description.text = news.description
            pubDate.text = news.pubDate
            newsContent.text = news.content
//            if (news.image_url != "null") {
//                Glide.with(applicationContext)
//                    .load(news.image_url)
//                    .into(image_url)
//            }

            if (news.videoUrl != "null") {
                val uri = Uri.parse(news.videoUrl)
//            holder.itemVideo.setVideoURI(uri)
                videoUrl.setVideoURI(uri)
                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoUrl)
                mediaController.setMediaPlayer(videoUrl)
                videoUrl.setMediaController(mediaController)
                videoUrl.start()
            }


            Log.d("example", news.videoUrl)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                NavUtils.navigateUpFromSameTask(this)
//                clickMe(ViewsApiActivity())
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun clickMe(activity: Activity) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }
}
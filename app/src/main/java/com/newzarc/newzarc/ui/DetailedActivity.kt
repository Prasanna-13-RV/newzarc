package com.newzarc.newzarc.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.newzarc.newzarc.R
import com.newzarc.newzarc.dataclass.News

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);


        var news = intent.getParcelableExtra<News>("news")
        if (news != null) {
            val title : TextView = findViewById(R.id.newsTitle)
            val content : TextView = findViewById(R.id.newsContent)
            val description : TextView = findViewById(R.id.newsDescription)
            val pubDate : TextView = findViewById(R.id.newsDate)
            val image_url : ImageView = findViewById(R.id.newsImage)

            title.text = news.title
            content.text = news.content
            description.text = news.description
            pubDate.text = news.pubDate
            Glide.with(applicationContext)
                .load(news.image_url)
                .into(image_url)

            Log.d("example", news.image_url)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
//                NavUtils.navigateUpFromSameTask(this)
                clickMe(AdminActivity())
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
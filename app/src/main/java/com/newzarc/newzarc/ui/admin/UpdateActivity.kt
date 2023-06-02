package com.newzarc.newzarc.ui.admin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.R
import com.newzarc.newzarc.dataclass.News
import org.json.JSONException
import org.json.JSONObject

class UpdateActivity : AppCompatActivity() {

    private lateinit var id: String
    private lateinit var title: EditText
    private lateinit var description : EditText
    private lateinit var content : EditText
    private lateinit var pubDate : EditText
    private lateinit var image_url : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);

        val news = intent.getParcelableExtra<News>("news")
        if (news != null) {
            title  = findViewById<EditText>(R.id.newsTitleInput)
            description = findViewById<EditText>(R.id.newsDescriptionInput)
            content = findViewById<EditText>(R.id.newsContentInput)
            pubDate = findViewById<EditText>(R.id.newsDateInput)
            image_url = findViewById<EditText>(R.id.newsImageUrlInput)

            title.setText(news.title)
            description.setText(news.description)
            content.setText(news.content)
            pubDate.setText(news.pubDate)
            image_url.setText(news.image_url)
            id = news.id.toString()
        }


//        Update Button
        val updateButton : Button = findViewById(R.id.updateNews)

        updateButton.setOnClickListener {

            var newsId = id
            var newsTitle = title.text.toString()
            var newsDescription = description.text.toString()
            var newsContent = content.text.toString()
            var newsPubDate = pubDate.text.toString()
            var newsImageUrl = image_url.text.toString()

            putRequest(newsTitle, newsDescription, newsContent, newsPubDate, newsImageUrl, newsId)
        }
    }


    private fun putRequest(newsTitle: String, newsDescription: String, newsContent: String, newsPubDate: String, newsImageUrl: String, newsId: String) {
//        Log.d("myexample", newsId)
        val requestQueue = Volley.newRequestQueue(this)
        val `object` = JSONObject()
        try {
            //input your API parameters
            `object`.put("title", newsTitle)
            `object`.put("description", newsDescription)
            `object`.put("content", newsContent)
            `object`.put("pubDate", newsPubDate)
            `object`.put("image_url", newsImageUrl)
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        Log.d("pbject", `object`.toString())
        // Enter the correct url for your api service site
        val url = "http://192.168.1.4:8080/news/update/$newsId"
        Log.d("pbject", url)

        val jsonObjectRequest = JsonObjectRequest(Request.Method.PUT, url, `object`, { response ->
            Log.d("pbjectresponse", response.toString())
            Toast.makeText(this, response.toString(), Toast.LENGTH_LONG).show()
        }) {error ->
            Log.d("pbjecterror", error.toString())
            Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
        }
        requestQueue.add(jsonObjectRequest)
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

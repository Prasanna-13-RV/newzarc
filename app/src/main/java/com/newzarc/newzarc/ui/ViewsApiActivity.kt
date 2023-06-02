package com.newzarc.newzarc.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.R
import com.newzarc.newzarc.adapter.NewsApiAdapter
import com.newzarc.newzarc.dataclass.NewsApi
import com.newzarc.newzarc.ui.admin.AdminActivity
import com.newzarc.newzarc.ui.admin.DetailedApiActivity

class ViewsApiActivity : AppCompatActivity() {
    var newsList = arrayListOf<NewsApi>()
    var apiSample = "https://newsdata.io/api/1/news?apikey=pub_23823de1160adf11fe144522010a017be3fd2&country=au,us"
    var recyclerView: RecyclerView? = null

    private lateinit var newsAdapter: NewsApiAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views_api)

        recyclerView = findViewById(R.id.newsRecycle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val reqQueue : RequestQueue = Volley.newRequestQueue(this)
        val request = JsonObjectRequest(Request.Method.GET, apiSample,null, { result ->

            val jsonArray = result.getJSONArray("results")
            for (i in 0 until jsonArray.length()) {
                val jsonObj = jsonArray.getJSONObject(i)

                val news = NewsApi(
                    jsonObj.getString("title"),
                    jsonObj.getString("link"),
                    jsonObj.getString("description"),
                    jsonObj.getString("content"),
                    jsonObj.getString("pubDate"),
                    jsonObj.getString("image_url")
                )
                newsList.add(news)
            }

            recyclerView?.layoutManager = LinearLayoutManager(this)
            recyclerView?.adapter = NewsApiAdapter(newsList)

            newsAdapter = NewsApiAdapter(newsList)
            recyclerView?.adapter = newsAdapter

            newsAdapter.onItemClick = {
                val intent = Intent(this, DetailedApiActivity::class.java)
                intent.putExtra("news", it)
                startActivity(intent)
            }
        }, {err ->
            Log.d("Volley Example error", err.toString())
        })

        reqQueue.add(request)
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
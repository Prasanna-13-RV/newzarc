package com.newzarc.newzarc.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.R
import com.newzarc.newzarc.adapter.NewsAdapter
import com.newzarc.newzarc.dataclass.News


class ViewsActivity : AppCompatActivity() {

    var newsList = arrayListOf<News>()
    var apiSample = "http://192.168.1.4:8080/allnews"
    var recyclerView: RecyclerView? = null

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views)

        recyclerView = findViewById(R.id.newsRecycleView)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);

        val reqQueue : RequestQueue = Volley.newRequestQueue(this)
        val request = JsonArrayRequest(Request.Method.GET, apiSample,null, { result ->
            val jsonArray = result
//            Log.d("Volley Example",jsonArray.toString())

            for (i in 0 until jsonArray.length()) {
                val jsonObj = jsonArray.getJSONObject(i)

                val news = News(
                    jsonObj.getString("title"),
                    jsonObj.getString("description"),
                    jsonObj.getString("content"),
                    jsonObj.getString("pubDate"),
                    jsonObj.getString("image_url")
                )

                newsList.add(news)
//                Log.d("hello", recipe.image_url.toString())
            }

            recyclerView?.layoutManager = LinearLayoutManager(this)
            recyclerView?.adapter = NewsAdapter(newsList)

            newsAdapter = NewsAdapter(newsList)
            recyclerView?.adapter = newsAdapter

            newsAdapter.onItemClick = {
                val intent = Intent(this, DetailedActivity::class.java)
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
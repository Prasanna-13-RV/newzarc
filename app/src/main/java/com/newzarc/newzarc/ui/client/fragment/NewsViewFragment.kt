package com.newzarc.newzarc.ui.client.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.R
import com.newzarc.newzarc.adapter.UserNewsAdapter
import com.newzarc.newzarc.databinding.FragmentNewsViewBinding
import com.newzarc.newzarc.dataclass.UserNews

class NewsViewFragment : Fragment() {

    private lateinit var binding : FragmentNewsViewBinding

    var newsList = arrayListOf<UserNews>()
    var apiSample = "https://newsdata.io/api/1/news?apikey=pub_23823de1160adf11fe144522010a017be3fd2&country=au,us"
    var recyclerView: RecyclerView? = null

    private lateinit var newsAdapter: UserNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsViewBinding.inflate(inflater, container, false)
        val reqQueue : RequestQueue = Volley.newRequestQueue(activity)

        recyclerView = binding.newsRecycle

        val request = JsonObjectRequest(Request.Method.GET, apiSample,null, { result ->

            val jsonArray = result.getJSONArray("results")

            for (i in 0 until jsonArray.length()) {
                val jsonObj = jsonArray.getJSONObject(i)
                Log.d("Volley Example ", jsonObj.toString())
                val news = UserNews(
                    jsonObj.getString("title"),
                    jsonObj.getString("link"),
                    jsonObj.getString("description"),
                    jsonObj.getString("content"),
                    jsonObj.getString("pubDate"),
                    jsonObj.getString("image_url")
                )
                newsList.add(news)
            }

            recyclerView?.layoutManager = LinearLayoutManager(activity)
            recyclerView?.adapter = UserNewsAdapter(newsList)

            newsAdapter = UserNewsAdapter(newsList)
            recyclerView?.adapter = newsAdapter

//            newsAdapter.onItemClick = {
//                val intent = Intent(this, DetailedApiActivity::class.java)
//                intent.putExtra("news", it)
//                startActivity(intent)
//            }
        }, {err ->
            Log.d("Volley Example error", err.toString())
        })

        reqQueue.add(request)
        return binding.root

    }
}
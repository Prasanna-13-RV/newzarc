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
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.adapter.HomeNewsAdapter
import com.newzarc.newzarc.databinding.FragmentBusinessUserBinding
import com.newzarc.newzarc.databinding.FragmentHomeUserBinding
import com.newzarc.newzarc.dataclass.HomeNews
import com.newzarc.newzarc.ui.client.DetailedUserActivity

class HomeUserFragment : Fragment() {

    private lateinit var binding : FragmentHomeUserBinding

    var newsList = arrayListOf<HomeNews>()
    var apiSample = "http://192.168.1.4:8080/allnews"
    var recyclerView: RecyclerView? = null

    private lateinit var newsAdapter: HomeNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeUserBinding.inflate(inflater, container, false)


        val reqQueue : RequestQueue = Volley.newRequestQueue(activity)

        recyclerView = binding.newsRecycle



        val request = JsonArrayRequest(Request.Method.GET, apiSample,null, { result ->

            val jsonArray = result

            for (i in 0 until jsonArray.length()) {
                val jsonObj = jsonArray.getJSONObject(i)
//                Log.d("Volley Example ", jsonObj.toString())
                val news = HomeNews(
                    jsonObj.getInt("id"),
                    jsonObj.getString("title"),
                    jsonObj.getString("description"),
                    jsonObj.getString("content"),
                    jsonObj.getString("pubDate"),
                    jsonObj.getString("image_url")
                )
                newsList.add(news)
            }

            recyclerView?.layoutManager = LinearLayoutManager(activity)
            recyclerView?.adapter = HomeNewsAdapter(newsList)

            newsAdapter = HomeNewsAdapter(newsList)
            recyclerView?.adapter = newsAdapter

//            newsAdapter.onItemClick = {
//                val intent = Intent(
//                    requireActivity().baseContext,
//                    DetailedUserActivity::class.java
//                )
//                intent.putExtra("message", it)
//                requireActivity().startActivity(intent)
//            }
        }, {err ->
            Log.d("Volley Example error", err.toString())
        })

        reqQueue.add(request)
        return binding.root

    }
}
package com.newzarc.newzarc.ui.admin.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var binding : FragmentDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(inflater, container, false)

        val newsLink = "http://192.168.1.8:8080/allnews"
        val userLink = "http://192.168.1.8:8080/allusers"

        val reqQueue : RequestQueue = Volley.newRequestQueue(activity)
        val newsNumberRequest = JsonArrayRequest(Request.Method.GET, newsLink,null, {result ->
            Log.d("Volley Example error", result.toString())
            binding.newsNumber.text = result.length().toString()
        }, {err ->
            Log.d("Volley Example error", err.toString())
        })

        val usersNumberRequest = JsonArrayRequest(Request.Method.GET, userLink,null, {result ->
            Log.d("Volley Example error", result.toString())
            binding.usersNumber.text = result.length().toString()
        }, {err ->
            Log.d("Volley Example error", err.toString())
        })

        reqQueue.add(newsNumberRequest)
        reqQueue.add(usersNumberRequest)

        return binding.root
    }


}
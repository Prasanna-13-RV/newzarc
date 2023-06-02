package com.newzarc.newzarc.ui.admin.fragment

import android.R
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.databinding.FragmentAddBinding
import org.json.JSONException
import org.json.JSONObject


class AddFragment : Fragment() {

    private lateinit var binding : FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddBinding.inflate(inflater, container, false)



        val addButton = binding.addNews

        addButton.setOnClickListener {
            val title = binding.newsTitleInput.text.toString()
            val description = binding.newsDescriptionInput.text.toString()
            val content = binding.newsContentInput.text.toString()
            val pubDate = binding.newsDateInput.text.toString()
            val image_url = binding.newsImageUrlInput.text.toString()

            postData(title, description, content, pubDate, image_url)
        }
        return binding.root
    }

    private fun postData(title : String, description : String, content : String, pubDate : String, image_url : String) {
        val requestQueue = Volley.newRequestQueue(activity)
        val `object` = JSONObject()
        try {
            //input your API parameters
            `object`.put("title", title)
            `object`.put("description", description)
            `object`.put("content", content)
            `object`.put("pubDate", pubDate)
            `object`.put("image_url", image_url)
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        Log.d("pbject", `object`.toString())
        // Enter the correct url for your api service site
        val url = "http://192.168.1.4:8080/news/create"
        val jsonObjectRequest = JsonObjectRequest(Request.Method.POST, url, `object`, { response ->
                Log.d("pbjectresponse", response.toString())
                Toast.makeText(activity, response.toString(), Toast.LENGTH_LONG).show()
        }) {error ->
            Log.d("pbjecterror", error.toString())
            Toast.makeText(activity, error.message, Toast.LENGTH_LONG).show()
        }
        requestQueue.add(jsonObjectRequest)
    }

}

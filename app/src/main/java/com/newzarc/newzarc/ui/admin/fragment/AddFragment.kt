package com.newzarc.newzarc.ui.admin.fragment

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextClock
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.FragmentAddBinding
import org.json.JSONException
import org.json.JSONObject
import java.util.Calendar


class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private lateinit var videoPath: String
    private lateinit var imagePath: String

    private lateinit var time : String
    private lateinit var date : String

    private lateinit var timeText : TextView
    private lateinit var dateText : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddBinding.inflate(inflater, container, false)


        val addButton = binding.addNews
        val timePicker = binding.timePicker

        timePicker.setOnClickListener {
            timePicker()
        }

        val datePicker = binding.datePicker

        datePicker.setOnClickListener {
            datePicker()
        }

        timeText = binding.timeText
        dateText = binding.dateText

        addButton.setOnClickListener {

            val title = binding.newsTitleInput.text.toString()
            val description = binding.newsDescriptionInput.text.toString()
            val content = binding.newsContentInput.text.toString()
//            val pubDate = binding.newsDateInput.text.toString()
            val image_url = binding.newsImageUrlInput.text.toString()
            val videoUrl = binding.newsVideoUrlInput.text.toString()

            postData(title, description, content, image_url, videoUrl)
        }
        return binding.root
    }

    private fun timePicker() {
        val mTimePicker: TimePickerDialog
        val mcurrentTime = Calendar.getInstance()
        val hour = mcurrentTime.get(Calendar.HOUR_OF_DAY)
        val minute = mcurrentTime.get(Calendar.MINUTE)
        mTimePicker = TimePickerDialog(context, object : TimePickerDialog.OnTimeSetListener {
            override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
                time = "${hourOfDay}:${minute}"
                timeText.text = time
                Log.d("TimeDate", time)
            }
        }, hour, minute, false)
        mTimePicker.show()
    }

    private fun datePicker() {
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)
        context?.let {
            DatePickerDialog(it, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                date = "${day}-${month + 1}-${year}"
                dateText.text = date
                Log.d("TimeDate", date)

            }, year, month, day).show()
        }
    }

    private fun postData(
        title: String,
        description: String,
        content: String,
        image_url: String,
        videoUrl: String
    ) {
        val requestQueue = Volley.newRequestQueue(activity)
        val `object` = JSONObject()
        try {
            //input your API parameters
            `object`.put("title", title)
            `object`.put("description", description)
            `object`.put("content", content)
            `object`.put("pubDate", "$date , $time")
            `object`.put("image_url", image_url)
            `object`.put("videoUrl", videoUrl)


        } catch (e: JSONException) {
            e.printStackTrace()
        }
        Log.d("pbject", `object`.toString())
        // Enter the correct url for your api service site
        val url = "http://172.16.9.52:8080/news/create"
        val jsonObjectRequest = JsonObjectRequest(Request.Method.POST, url, `object`, { response ->
            Log.d("pbjectresponse", response.toString())
            Toast.makeText(activity, response.toString(), Toast.LENGTH_LONG).show()
        }) { error ->
            Log.d("pbjecterror", error.toString())
            Toast.makeText(activity, error.message, Toast.LENGTH_LONG).show()
        }
        requestQueue.add(jsonObjectRequest)
    }



    private fun navigateFragment() {
        findNavController().navigate(com.newzarc.newzarc.R.id.action_addFragment_to_dashboardFragment)
        Log.d("pbjectsumma", "summa")
    }
}
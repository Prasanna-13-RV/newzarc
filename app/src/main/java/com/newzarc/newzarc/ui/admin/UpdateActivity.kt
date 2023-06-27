package com.newzarc.newzarc.ui.admin

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.newzarc.newzarc.R
import com.newzarc.newzarc.databinding.ActivityUpdateBinding
import com.newzarc.newzarc.dataclass.News
import org.json.JSONException
import org.json.JSONObject
import java.util.Calendar

class UpdateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateBinding

    private lateinit var time: String
    private lateinit var date: String

    private lateinit var timeText: TextView
    private lateinit var dateText: TextView

    private lateinit var id: String
    private lateinit var title: EditText
    private lateinit var description: EditText
    private lateinit var content: EditText
    private lateinit var pubDate: EditText
    private lateinit var image_url: EditText
    private lateinit var videoUrl: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);

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

        val newss = intent.getStringExtra("editNews")
        val news = Gson().fromJson(newss, News::class.java)
        Log.d("responseedit", news.title)

        if (news != null) {
            title = findViewById<EditText>(R.id.newsTitleInput)
            description = findViewById<EditText>(R.id.newsDescriptionInput)
            content = findViewById<EditText>(R.id.newsContentInput)
            pubDate = findViewById<EditText>(R.id.newsDateInput)
            image_url = findViewById<EditText>(R.id.newsImageUrlInput)
            videoUrl = findViewById<EditText>(R.id.newsVideoUrlInput)


            title.setText(news.title)
            description.setText(news.description)
            content.setText(news.content)
            pubDate.setText(news.pubDate)
            image_url.setText(news.image_url)
            videoUrl.setText(news.videoUrl)

            val datetime = news.pubDate.split(",")
            Log.d("edit", datetime.toString())

            dateText.text = datetime[0].substring(1).trim()
            timeText.text = datetime[1].substring(0, datetime[1].length - 1).trim()

            date = datetime[0].substring(1).trim()
            time = datetime[1].substring(0, datetime[1].length - 1).trim()

            id = news.id.toString()
        }


//        Update Button
        val updateButton = binding.updateNews

        updateButton.setOnClickListener {

            var newsId = id
            var newsTitle = title.text.toString()
            var newsDescription = description.text.toString()
            var newsContent = content.text.toString()
            var newsPubDate = pubDate.text.toString()
            var newsImageUrl = image_url.text.toString()
            var newsVideoUrl = videoUrl.text.toString()

            putRequest(
                newsTitle,
                newsDescription,
                newsContent,
                newsPubDate,
                newsImageUrl,
                newsId,
                newsVideoUrl
            )
        }
    }


    private fun putRequest(
        newsTitle: String,
        newsDescription: String,
        newsContent: String,
        newsPubDate: String,
        newsImageUrl: String,
        newsId: String,
        newsVideoUrl: String
    ) {
//        Log.d("myexample", newsId)
        val requestQueue = Volley.newRequestQueue(this)
        val `object` = JSONObject()
        try {
            //input your API parameters
            `object`.put("title", newsTitle)
            `object`.put("description", newsDescription)
            `object`.put("content", newsContent)
            `object`.put("pubDate", "$date , $time")
            `object`.put("image_url", newsImageUrl)
            `object`.put("videoUrl", newsVideoUrl)
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        Log.d("pbject", `object`.toString())
        // Enter the correct url for your api service site
        val url = "http://192.168.1.8:8080/news/update/$newsId"
        Log.d("pbject", url)

        val jsonObjectRequest = JsonObjectRequest(Request.Method.PUT, url, `object`, { response ->
            Log.d("pbjectresponse", response.toString())
            Toast.makeText(this, response.toString(), Toast.LENGTH_LONG).show()
        }) { error ->
            Log.d("pbjecterror", error.toString())
            Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
        }
        requestQueue.add(jsonObjectRequest)
    }

    private fun timePicker() {
        val mTimePicker: TimePickerDialog
        val mcurrentTime = Calendar.getInstance()
        val hour = mcurrentTime.get(Calendar.HOUR_OF_DAY)
        val minute = mcurrentTime.get(Calendar.MINUTE)
        mTimePicker = TimePickerDialog(this, object : TimePickerDialog.OnTimeSetListener {
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
        this?.let {
            DatePickerDialog(it, DatePickerDialog.OnDateSetListener { view, year, month, day ->
                date = "${day}-${month + 1}-${year}"
                dateText.text = date
                Log.d("TimeDate", date)

            }, year, month, day).show()
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

package com.newzarc.newzarc.ui.admin

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Canvas
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.internal.ContextUtils.getActivity
import com.google.gson.Gson
import com.newzarc.newzarc.R
import com.newzarc.newzarc.adapter.NewsAdapter
import com.newzarc.newzarc.dataclass.News

class ViewsActivity : AppCompatActivity() {

    var newsList = arrayListOf<News>()
    var apiSample = "http://192.168.1.8:8080/allnews"
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
            Log.d("Volley Example",jsonArray.toString())

            for (i in 0 until jsonArray.length()) {
                val jsonObj = jsonArray.getJSONObject(i)

                val news = News(
                    jsonObj.getInt("id"),
                    jsonObj.getString("title"),
                    jsonObj.getString("description"),
                    jsonObj.getString("content"),
                    jsonObj.getString("pubDate"),
                    jsonObj.getString("image_url"),
                    jsonObj.getString("videoUrl")
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
                Log.d("WelcomeViews", it.toString())
                intent.putExtra("news", it)
                startActivity(intent)
            }


//
//            newsAdapter.onItemDelete = {
//                val news = it
//                val newsId = news.id
//                Log.d("myexample", news.id.toString())
//                deleteNews(newsId)
//            }

//            newsAdapter.onItemEdit = {
//                val intent = Intent(this, UpdateActivity::class.java)
//                intent.putExtra("news", it)
//                startActivity(intent)
//            }


        }, {err ->
            Log.d("Volley Example error", err.toString())
        })
        reqQueue.add(request)

//        slide code
        val simpleCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onChildDraw(
                c: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean
            ) {

                // If you want to add a background, a text, an icon
                //  as the user swipes, this is where to start decorating
                //  I will link you to a library I created for that below

//                val colorAlert = ContextCompat.getColor(this@ViewsActivity, R.color.colorAlert)
//                val teal200 = ContextCompat.getColor(this@ViewsActivity, R.color.teal_200)
//                val defaultWhiteColor = ContextCompat.getColor(this@ViewsActivity, R.color.white)

//                Builder(c, recyclerView, viewHolder, dX, actionState).set(
//                    backgroundColorFromStartToEnd = colorAlert,
//                    backgroundColorFromEndToStart = teal200,
//                    textFromStartToEnd = getString(R.string.action_delete),
//                    textFromEndToStart = getString(R.string.action_add_to_fav),
//                    textColorFromStartToEnd = defaultWhiteColor,
//                    textColorFromEndToStart = defaultWhiteColor,
//                    iconTintColorFromStartToEnd = defaultWhiteColor,
//                    iconTintColorFromEndToStart = defaultWhiteColor,
//                    textSizeFromStartToEnd = 16f,
//                    textSizeFromEndToStart = 16f,
//                    typeFaceFromStartToEnd = Typeface.DEFAULT_BOLD,
//                    typeFaceFromEndToStart = Typeface.SANS_SERIF,
//                    iconResIdFromStartToEnd = R.drawable.baseline_delete_24,
//                    iconResIdFromEndToStart = R.drawable.baseline_done_24
//                )



                super.onChildDraw(
                    c,
                    recyclerView,
                    viewHolder,
                    dX/4,
                    dY,
                    actionState,
                    isCurrentlyActive
                )
            }

            @SuppressLint("NotifyDataSetChanged", "RestrictedApi")
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {

                val position = viewHolder.adapterPosition

                when(direction) {
                    ItemTouchHelper.LEFT -> {
                        val builder: AlertDialog.Builder = AlertDialog.Builder(getActivity(this@ViewsActivity))
                        builder.setMessage("Are you sure you want to delete?")
                            .setCancelable(false)
                            .setPositiveButton("Yes") { dialog, id ->
//                                Toast.makeText(this@ViewsActivity, "Swiped Left", Toast.LENGTH_LONG).show()
                                //                                    getActivity().finish();
                                val act = newsList[position]
                                deleteNews(act.id)
                                newsList.remove(act)
                                recyclerView?.adapter?.notifyDataSetChanged()
                            }
                            .setNegativeButton(
                                "No"
                            ) { dialog, id -> dialog.cancel() }
                        val alert = builder.create()
                        alert.show()
                    }
                    ItemTouchHelper.RIGHT -> {
//                        Toast.makeText(this@ViewsActivity, "Swiped right", Toast.LENGTH_LONG).show()
                        val builder: AlertDialog.Builder = AlertDialog.Builder(getActivity(this@ViewsActivity))
                        builder.setMessage("Are you sure you want to edit this item?")
                            .setCancelable(false)
                            .setPositiveButton("Yes") { dialog, id ->
//                                yes
                                val act = newsList[position]
                                editNews(act.id)
                            }
                            .setNegativeButton(
                                "No"
                            ) { dialog, id -> dialog.cancel() }
                        val alert = builder.create()
                        alert.show()
                    }
                }
            }
        }
        val itemTouchHelp = ItemTouchHelper(simpleCallback)
        itemTouchHelp.attachToRecyclerView(recyclerView)

//        slide code ends
    }

    private fun deleteNews(newsId: Int) {
        val requestQueue = Volley.newRequestQueue(this)
        val url = "http://192.168.1.8:8080/news/delete/$newsId"
        val jsonObjectRequest = StringRequest(Request.Method.DELETE, url, { response ->
            Log.d("pbjectresponse", response.toString())
            Toast.makeText(this, response.toString(), Toast.LENGTH_LONG).show()
        }) {error ->
            Log.d("pbjecterror", error.toString())
            Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
        }
        requestQueue.add(jsonObjectRequest)
    }


    private fun editNews(newsId : Int) {
        val requestQueue = Volley.newRequestQueue(this)
        val editApi = "http://192.168.1.8:8080/news/$newsId"
        val jsonObjectRequest = StringRequest(Request.Method.GET, editApi, { response ->
            Log.d("pbjectresponse", response)
            val intent = Intent(this, UpdateActivity::class.java)
//            intent.putExtra("editNews", Gson().toJson(response))
            intent.putExtra("editNews", response)
            startActivity(intent)

//            val bundle = Bundle()
//            val intent = Intent(this, UpdateActivity::class.java)
//            bundle.putSerializable("value", response)
//            intent.putExtras(bundle)
//            startActivity(intent)


//            Toast.makeText(this, response.toString(), Toast.LENGTH_LONG).show()
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
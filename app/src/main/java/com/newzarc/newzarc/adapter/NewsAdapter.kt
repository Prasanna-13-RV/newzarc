package com.newzarc.newzarc.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.newzarc.newzarc.R
import com.newzarc.newzarc.dataclass.News

class NewsAdapter(private val newsList: ArrayList<News>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    private lateinit var context : Context
    var onItemClick : ((News) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context = parent.context
        val itemView = LayoutInflater.from(context).inflate(R.layout.news_card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]

        if (currentItem.image_url == null) {
            Glide.with(context).load("https://static.seekingalpha.com/uploads/2012/6/23/261750-13404618131438339-George-Acs.jpg").into(holder.itemImage)
//            holder.itemImage.setImageURI(Uri.parse("https://static.seekingalpha.com/uploads/2012/6/23/261750-13404618131438339-George-Acs.jpg"))
        }
        else {
            Glide.with(context).load(currentItem.image_url).into(holder.itemImage)
        }
        holder.itemTitle.text = currentItem.title
        holder.itemDescription.text = currentItem.content

        holder.viewButton.setOnClickListener {
            onItemClick?.invoke(currentItem)
        }
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val itemImage : ImageView = itemView.findViewById(R.id.newsImage)
        val itemTitle : TextView = itemView.findViewById(R.id.newsTitle)
        val itemDescription : TextView = itemView.findViewById(R.id.subtitle)
        val viewButton : TextView = itemView.findViewById(R.id.viewButton)
    }
}
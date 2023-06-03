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
import com.newzarc.newzarc.dataclass.UserNews

class UserNewsAdapter(private val newsList: ArrayList<UserNews>) :
    RecyclerView.Adapter<UserNewsAdapter.MyViewHolder>() {

    private lateinit var context : Context
    var onItemClick : ((UserNews) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context = parent.context
        val itemView = LayoutInflater.from(context).inflate(R.layout.user_news_card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]

        if (currentItem.image_url.equals(null)) {
            val imageURL : String = "https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?cs=srgb&dl=pexels-pixabay-268533.jpg&fm=jpg"
            Glide.with(context).load(imageURL).into(holder.itemImage)
        }
        else {
            Glide.with(context).load(currentItem?.image_url).into(holder.itemImage)
        }


        holder.itemTitle.text = currentItem.title
        holder.itemDescription.text = currentItem.pubDate

//        holder.viewButton.setOnClickListener {
//            onItemClick?.invoke(currentItem)
//        }
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {


        val itemImage : ImageView = itemView.findViewById(R.id.newsImageUser)
        val itemTitle : TextView = itemView.findViewById(R.id.headingNews)
        val itemDescription : TextView = itemView.findViewById(R.id.dateNews)
    }
}
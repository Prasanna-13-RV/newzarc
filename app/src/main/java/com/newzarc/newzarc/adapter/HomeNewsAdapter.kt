package com.newzarc.newzarc.adapter

import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.newzarc.newzarc.R
import com.newzarc.newzarc.dataclass.HomeNews
import com.newzarc.newzarc.dataclass.News

class HomeNewsAdapter(private val newsList: ArrayList<HomeNews>) :
    RecyclerView.Adapter<HomeNewsAdapter.MyViewHolder>() {

    private lateinit var context : Context
    var onItemClick : ((HomeNews) -> Unit)? = null
    var onItemEdit : ((HomeNews) -> Unit)? = null
//    var onItemDelete : ((HomeNews) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        context = parent.context
        val itemView = LayoutInflater.from(context).inflate(R.layout.video_card, parent, false)
        return MyViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]

//        if (currentItem.image_url != "null") {
//            Glide.with(context).load(currentItem.image_url).into(holder.itemImage)
//        }
        holder.itemTitle.text = currentItem.title
        holder.itemDescription.text = currentItem.pubDate

        holder.itemTitle.setOnClickListener {
            onItemClick?.invoke(currentItem)
        }

//        holder.editButton.setOnClickListener {
//            onItemEdit?.invoke(currentItem)
//        }
//
//
//        holder.deleteButton.setOnClickListener {
//            onItemDelete?.invoke(currentItem)
//        }

//        val uri = Uri.parse("https://download-video.akamaized.net/2/playback/7a45931d-3fb9-4590-bf8e-120bbe8558e1/2db67dfa-b2f8b0c5?__token__=st=1685955718~exp=1685970118~acl=%2F2%2Fplayback%2F7a45931d-3fb9-4590-bf8e-120bbe8558e1%2F2db67dfa-b2f8b0c5%2A~hmac=681806398e26145a098f39f9051d68378d071d191b5847f04086812d9eee52de&r=dXMtZWFzdDE%3D")
        val uri = Uri.parse(currentItem.videoUrl)
        Log.d("video example", currentItem.videoUrl)
        holder.itemVideo.setVideoURI(uri)

        val mediaController = MediaController(context)
        mediaController.setAnchorView(holder.itemVideo)
        mediaController.setMediaPlayer(holder.itemVideo)
        holder.itemVideo.setMediaController(mediaController)
        holder.itemVideo.start()
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

//        val itemImage : ImageView = itemView.findViewById(R.id.newsImageUser)
        val itemTitle : TextView = itemView.findViewById(R.id.headingNews)
        val itemDescription : TextView = itemView.findViewById(R.id.dateNews)
        val itemVideo : VideoView = itemView.findViewById(R.id.video_view)
    }
}

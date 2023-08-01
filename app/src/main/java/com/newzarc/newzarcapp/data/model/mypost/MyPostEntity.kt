package com.newzarc.newzarcapp.data.model.mypost

data class MyPostEntity(
    val idPost: Int?,
    val namePost: String,
    val descriptionPost: String,
    val imageUrlPost: String,
    val likePost: Int?,
    val user_id: Int?,
)

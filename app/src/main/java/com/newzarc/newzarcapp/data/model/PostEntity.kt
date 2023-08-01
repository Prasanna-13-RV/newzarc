package com.newzarc.newzarcapp.data.model

data class PostEntity(
    val idPost: Int,
    val namePost: String,
    val descriptionPost: String,
    val imageUrlPost: String,
    val likePost: Int,
    val user_id: Int,
    val name_user: String,
    val image_user: String,
)
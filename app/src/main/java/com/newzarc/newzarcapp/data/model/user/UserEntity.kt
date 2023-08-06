package com.newzarc.newzarcapp.data.model.user

data class UserEntity(
    val user_id : Int,
    val name_user: String,
    val email_user: String,
    val phone_user: String,
    val password_user: String,
    val image_user : String
)

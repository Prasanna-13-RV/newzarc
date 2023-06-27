package com.newzarc.newzarc.dataclass

data class User(
    val user_id: Int,
    val name: String,
    val email: String,
    val password: String,
    val aboutMe: String,
    val phone: String,
    val userImage: String,
    val isSubscribe: String
)

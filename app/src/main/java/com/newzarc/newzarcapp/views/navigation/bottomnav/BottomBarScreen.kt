package com.newzarc.newzarcapp.views.navigation.bottomnav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route : String,
    val title: String,
    val icon : ImageVector
    ) {
    object News : BottomBarScreen(
        route = "news",
        title = "News",
        icon = Icons.Default.Create
    )
    object Posts : BottomBarScreen(
        route = "posts",
        title = "Posts",
        icon = Icons.Default.Person
    )
    object Add : BottomBarScreen(
        route = "addPost",
        title = "Add",
        icon = Icons.Default.Create
    )
    object Show : BottomBarScreen(
        route = "myPost",
        title = "My Post",
        icon = Icons.Default.Create
    )
    object Account : BottomBarScreen(
        route = "account",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )
}

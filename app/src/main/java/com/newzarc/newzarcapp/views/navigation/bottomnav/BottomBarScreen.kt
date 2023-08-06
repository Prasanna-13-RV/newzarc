package com.newzarc.newzarcapp.views.navigation.bottomnav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route : String,
    val title: String,
    val icon : ImageVector
    ) {
    object NewsScreen : BottomBarScreen(
        route = "newsScreen",
        title = "News",
        icon = Icons.Outlined.Home
    )
    object SingleNewsScreen : BottomBarScreen(
        route = "singleNewsScreen",
        title = "Single News",
        icon = Icons.Default.Create
    )
    object PostsScreen : BottomBarScreen(
        route = "postsScreen",
        title = "Posts",
        icon = Icons.Default.List
    )
    object AddPostScreen : BottomBarScreen(
        route = "addPostScreen",
        title = "Add",
        icon = Icons.Default.Add
    )
    object ShowPostScreen : BottomBarScreen(
        route = "myPostScreen",
        title = "My Post",
        icon = Icons.Default.Create
    )
    object AccountScreen : BottomBarScreen(
        route = "accountScreen",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )
    object LoginScreen : BottomBarScreen(
        route = "loginScreen",
        title = "Login",
        icon = Icons.Default.AccountCircle
    )
    object RegisterScreen : BottomBarScreen(
        route = "registerScreen",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )
    object UpdateProfileAccount : BottomBarScreen(
        route = "updateProfileScreen",
        title = "Update Profile",
        icon = Icons.Default.AccountCircle
    )
}

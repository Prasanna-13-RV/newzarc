package com.newzarc.newzarcapp.views.navigation.drawernav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerScreen(
    val route : String,
    val title: String,
    val icon : ImageVector
) {
    object Show : DrawerScreen(
        route = "myPost",
        title = "My Post",
        icon = Icons.Default.Create
    )
    object Account : DrawerScreen(
        route = "account",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )
}


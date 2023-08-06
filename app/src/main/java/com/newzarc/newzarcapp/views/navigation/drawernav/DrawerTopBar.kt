package com.newzarc.newzarcapp.views.navigation.drawernav

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerTopBar(
    navController: NavController,
    name: String,
    screenName: String
) {

//    DrawerNavBar(navController = navController!!)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        TopAppBar(
            modifier = Modifier.shadow(elevation = 8.dp),
            title = { Text(text = name) },
            navigationIcon = {
                IconButton(
                    onClick = {
//                        navController.navigate(BottomBarScreen.NewsScreen.route)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Go back"
                    )
                }
            },
        )
    }
}
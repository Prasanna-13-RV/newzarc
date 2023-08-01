package com.newzarc.newzarcapp.views.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen
import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(openDrawer: () -> Unit) {
    val navigation = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navigation) }
    ) {
        BottomNavGraph(navigation, openDrawer)
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.News,
        BottomBarScreen.Posts,
        BottomBarScreen.Add,
//        BottomBarScreen.Show,
//        BottomBarScreen.Account,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val isSelected = currentDestination?.hierarchy?.any {
        it.route == screen.route
    } == true

    BottomNavigationItem(
        selected = isSelected,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        },
        icon = { Icon(imageVector = screen.icon, contentDescription = screen.title) },
        label = { if (isSelected) Text(text = screen.title) }
    )
}
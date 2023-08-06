import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.newzarc.newzarcapp.data.model.news.NewsEntity
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen
import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomNavGraph
import com.newzarc.newzarcapp.views.screens.AddPostScreen
import com.newzarc.newzarcapp.views.screens.NewsScreen
import com.newzarc.newzarcapp.views.screens.PostScreen
import com.newzarc.newzarcapp.views.screens.SingleNewsScreen
import com.newzarc.newzarcapp.views.screens.admin.LoginScreen
import com.newzarc.newzarcapp.views.screens.admin.RegisterScreen
import com.newzarc.newzarcapp.views.screens.profile.UpdateProfile

//package com.newzarc.newzarcapp.views.navigation
//
//import android.annotation.SuppressLint
//import androidx.compose.foundation.layout.RowScope
//import androidx.compose.material.BottomNavigation
//import androidx.compose.material.BottomNavigationItem
//import androidx.compose.material.ContentAlpha
//import androidx.compose.material.Icon
//import androidx.compose.material.LocalContentColor
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.navigation.NavDestination
//import androidx.navigation.NavDestination.Companion.hierarchy
//import androidx.navigation.NavGraph.Companion.findStartDestination
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.currentBackStackEntryAsState
//import androidx.navigation.compose.rememberNavController
//import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen
//import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomNavGraph
//
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MainScreen(openDrawer: () -> Unit) {
//    val navigation = rememberNavController()
//    Scaffold(
//        bottomBar = { BottomBar(navController = navigation) }
//    ) {
//        BottomNavGraph(navigation, openDrawer)
//    }
//}
//
//@Composable
//fun BottomBar(navController: NavHostController) {
//    val screens = listOf(
//        BottomBarScreen.News,
//        BottomBarScreen.Posts,
//        BottomBarScreen.Add,
////        BottomBarScreen.Show,
////        BottomBarScreen.Account,
//    )
//
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentDestination = navBackStackEntry?.destination
//
//    BottomNavigation {
//        screens.forEach { screen ->
//            AddItem(
//                screen = screen,
//                currentDestination = currentDestination,
//                navController = navController
//            )
//        }
//    }
//}
//
//@Composable
//fun RowScope.AddItem(
//    screen: BottomBarScreen,
//    currentDestination: NavDestination?,
//    navController: NavHostController
//) {
//    val isSelected = currentDestination?.hierarchy?.any {
//        it.route == screen.route
//    } == true
//
//    BottomNavigationItem(
//        selected = isSelected,
//        onClick = {
//            navController.navigate(screen.route) {
//                popUpTo(navController.graph.findStartDestination().id)
//                launchSingleTop = true
//            }
//        },
//        icon = { Icon(imageVector = screen.icon, contentDescription = screen.title) },
////        label = { if (isSelected) Text(text = screen.title) }
//        label = { Text(text = screen.title) }
//    )
//}


@Composable
fun MainScreen(openDrawer: () -> Unit) {

    val navController = rememberNavController()
    val myviewmodel = hiltViewModel<NewsViewModel>()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination


    Box(modifier = Modifier.fillMaxWidth()) {
        var selected by remember {
            mutableStateOf("Home")
        }
        BottomNavGraph(navController, openDrawer)

        BottomNavigation(
            modifier = Modifier.align(alignment = Alignment.BottomCenter)
        ) {

            BottomNavigationItem(
                selected = selected == BottomBarScreen.NewsScreen.route,
                onClick = {
                    selected = BottomBarScreen.NewsScreen.route
                    navController.navigate(BottomBarScreen.NewsScreen.route)
                },
                icon = {
                    Icon(
                        imageVector = BottomBarScreen.NewsScreen.icon,
                        contentDescription = BottomBarScreen.NewsScreen.title
                    )
                },
                label = { Text(text = BottomBarScreen.NewsScreen.title) }
            )

            BottomNavigationItem(
                selected = selected == BottomBarScreen.AddPostScreen.route,
                onClick = {
                    selected = BottomBarScreen.AddPostScreen.route
                    navController.navigate(BottomBarScreen.AddPostScreen.route)
                },
                icon = {
                    Icon(
                        imageVector = BottomBarScreen.AddPostScreen.icon,
                        contentDescription = BottomBarScreen.AddPostScreen.title
                    )
                },
                label = { Text(text = BottomBarScreen.AddPostScreen.title) }
            )

            BottomNavigationItem(
                selected = selected == BottomBarScreen.PostsScreen.route,
                onClick = {
                    selected = BottomBarScreen.PostsScreen.route
                    navController.navigate(BottomBarScreen.PostsScreen.route)
                },
                icon = {
                    Icon(
                        imageVector = BottomBarScreen.PostsScreen.icon,
                        contentDescription = BottomBarScreen.PostsScreen.title
                    )
                },
                label = { Text(text = BottomBarScreen.PostsScreen.title) }
            )

        }
    }
}
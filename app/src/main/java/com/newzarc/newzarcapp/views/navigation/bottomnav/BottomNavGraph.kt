package com.newzarc.newzarcapp.views.navigation.bottomnav

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.newzarc.newzarcapp.data.model.NewsEntity
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.screens.AddPostScreen
import com.newzarc.newzarcapp.views.screens.NewsScreen
import com.newzarc.newzarcapp.views.screens.PostScreen
import com.newzarc.newzarcapp.views.screens.SingleNewsScreen
import com.newzarc.newzarcapp.views.screens.admin.LoginScreen
import com.newzarc.newzarcapp.views.screens.profile.UpdateProfile

@Composable
fun BottomNavGraph(navController: NavHostController, openDrawer: () -> Unit) {

    val myviewmodel = hiltViewModel<NewsViewModel>()

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.News.route
//                startDestination = "updateProfileScreen"
    ) {
        composable(route = BottomBarScreen.News.route) {
            NewsScreen(navController = navController, myViewModel = myviewmodel, openDrawer)
        }
        composable(route = BottomBarScreen.Posts.route) {
            PostScreen(navController = navController,myviewmodel, openDrawer)
        }
        composable(route = BottomBarScreen.Account.route) {
            LoginScreen(navController = navController)
        }
        composable(route = "singleNewsScreen") {
            val result =
                navController.previousBackStackEntry?.savedStateHandle?.get<NewsEntity>("news")
            SingleNewsScreen(navController, result, openDrawer)
        }
//        composable (route = BottomBarScreen.Show.route) {
//            MyPostScreen(navController = navController)
//        }
        composable(route = BottomBarScreen.Add.route) {
            AddPostScreen(navController = navController, openDrawer)
        }
//        Profile
        composable(route = "updateProfileScreen") {
            UpdateProfile(navController, openDrawer)
        }
    }
}
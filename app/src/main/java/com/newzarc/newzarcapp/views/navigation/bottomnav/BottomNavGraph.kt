package com.newzarc.newzarcapp.views.navigation.bottomnav

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.newzarc.newzarcapp.data.model.news.NewsEntity
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.screens.AddPostScreen
import com.newzarc.newzarcapp.views.screens.MyPostScreen
import com.newzarc.newzarcapp.views.screens.NewsScreen
import com.newzarc.newzarcapp.views.screens.PostScreen
import com.newzarc.newzarcapp.views.screens.SingleNewsScreen
import com.newzarc.newzarcapp.views.screens.admin.LoginScreen
import com.newzarc.newzarcapp.views.screens.admin.RegisterScreen
import com.newzarc.newzarcapp.views.screens.profile.ProfileScreen
import com.newzarc.newzarcapp.views.screens.profile.UpdateProfile

@Composable
fun BottomNavGraph(navController: NavHostController, openDrawer: () -> Unit) {

    val myviewmodel = hiltViewModel<NewsViewModel>()

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.LoginScreen.route
    ) {
//        All News
        composable(route = BottomBarScreen.NewsScreen.route) {
            NewsScreen(navController = navController, myViewModel = myviewmodel, openDrawer)
        }
//        Post
        composable(route = BottomBarScreen.PostsScreen.route) {
            PostScreen(navController = navController, myviewmodel, openDrawer)
        }
//        Login
        composable(route = BottomBarScreen.LoginScreen.route) {
            LoginScreen(navController = navController, myviewmodel)
        }
//        Register
        composable(route = BottomBarScreen.RegisterScreen.route) {
            RegisterScreen(navController = navController, myviewmodel)
        }
//        Single News
        composable(route = BottomBarScreen.SingleNewsScreen.route) {
            val result =
                navController.previousBackStackEntry?.savedStateHandle?.get<NewsEntity>("news")
            Log.d("news", result.toString())
            SingleNewsScreen(navController, result, openDrawer)
        }
//        My Post
        composable(route = BottomBarScreen.ShowPostScreen.route) {
            MyPostScreen(navController = navController, myviewmodel, openDrawer)
        }
//        Add Post
        composable(route = BottomBarScreen.AddPostScreen.route) {
            AddPostScreen(navController, myviewmodel, openDrawer)
        }
//        Profile
        composable(route = BottomBarScreen.AccountScreen.route) {
            ProfileScreen(navController, myviewmodel, openDrawer)
        }
//        Update Profile
        composable(route = BottomBarScreen.UpdateProfileAccount.route) {
            UpdateProfile(navController, openDrawer)
        }
    }
}
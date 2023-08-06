package com.newzarc.newzarcapp.viewmodel

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.google.gson.Gson
import com.newzarc.newzarcapp.data.model.mypost.MyPostEntity
import com.newzarc.newzarcapp.data.model.user.UserEntity
import com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase
import com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase
import com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase
import com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase
import com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase
import com.newzarc.newzarcapp.domain.usecase.user.GetUserUserCase
import com.newzarc.newzarcapp.domain.usecase.user.PostCreateUserUseCase
import com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen
import com.newzarc.newzarcapp.views.screens.components.NotificationFunction
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val getNewsUseCase: GetNewsUseCase,
    private val updateNewsUseCase: UpdateNewsUseCase,
    private val getPostsUseCase: GetPostsUseCase,
    private val getMyPostUseCase: GetMyPostUseCase,
    private val postCreateUseCase: PostCreateUseCase,
    private val getUserUserCase: GetUserUserCase,
    private val postCreateUserUseCase: PostCreateUserUseCase
) : ViewModel() {

    fun isInternetAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkCapabilities = connectivityManager.activeNetwork ?: return false
        val activeNetwork =
            connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false

        return activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
                || activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
    }

    fun getNews() = liveData {
        val newsList = getNewsUseCase.execute()
        emit(newsList)
    }

    fun updateNews() = liveData {
        val newsList = updateNewsUseCase.execute()
        emit(newsList)
    }

    fun getPosts() = liveData {
        val postsList = getPostsUseCase.execute()
        emit(postsList)
    }

    fun getMyPosts(user_id: String) = liveData {
        val postsList = getMyPostUseCase.execute(user_id)
//        Log.d("Myviewget", "Hrllo")
//        Log.d("Myviewget", postsList.toString())
        emit(postsList)
    }

    fun createPost(post: MyPostEntity, context: Context) {
        viewModelScope.launch {
            val post1 = postCreateUseCase.execute(post)
            NotificationFunction(context, "Newzarc", "${post.namePost} Created")
        }
    }


    fun getUserByEmail(
        email: String,
        password: String,
        context: Context,
        navController: NavController
    ): List<UserEntity>? {
        var user: List<UserEntity>? = null

        viewModelScope.launch {
            user = getUserUserCase.execute(email)
            if (user?.isNotEmpty() == true) {
                val userEnt = user!![0]
                Log.d("myuser", userEnt.toString())
                if (userEnt.password_user == password) {
//                    clearSharedObject(context, "userPref", "loginUser")
                    saveSharedObject(context, userEnt, "userPref", "loginUser")
                    navController.navigate(BottomBarScreen.NewsScreen.route)
                    Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
                } else {
                    user = null
                    Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
                }
            }
        }
//        Log.d("myuserreturn", user.toString())
        return user
    }

    fun createUser(user: UserEntity, navController: NavController, context: Context) {
        viewModelScope.launch {
            val user1 = postCreateUserUseCase.execute(user)
            NotificationFunction(context, "Newzarc", "${user.name_user} Created")
            navController.navigate("")
        }
    }

    //    Shared Preferences
    private val gson = Gson()

    fun saveSharedObject(context: Context, obj: Any, PREFS_NAME: String, KEY_OBJECT: String) {
        val jsonString = gson.toJson(obj)
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(KEY_OBJECT, jsonString)
        editor.apply()
    }

    fun getSharedObject(
        context: Context,
        clazz: Class<*>,
        PREFS_NAME: String,
        KEY_OBJECT: String
    ): Any? {
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val jsonString = sharedPreferences.getString(KEY_OBJECT, null)
        return gson.fromJson(jsonString, clazz)
    }

    fun clearSharedObject(context: Context, PREFS_NAME: String, KEY_OBJECT: String) {
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.remove(KEY_OBJECT)
        editor.apply()
    }

//    val context = LocalContext.current


}
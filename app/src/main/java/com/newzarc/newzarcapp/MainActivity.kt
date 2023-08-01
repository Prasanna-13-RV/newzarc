package com.newzarc.newzarcapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.newzarc.newzarcapp.data.model.news.NewsEntity
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.navigation.MainScreen
import com.newzarc.newzarcapp.views.navigation.drawernav.DrawerNavBar
import com.newzarc.newzarcapp.views.screens.NewsScreen
import com.newzarc.newzarcapp.views.screens.PostScreen
import com.newzarc.newzarcapp.views.screens.SingleNewsScreen
import com.newzarc.newzarcapp.views.screens.admin.LoginScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NewzarcAppTheme {
                val navigation = rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
//                    MainScreen()
                    DrawerNavBar(navigation)
                }

            }
        }
    }
}
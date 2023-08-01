package com.newzarc.newzarcapp.views.navigation.drawernav

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.DrawerValue
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalDrawer
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.navigation.MainScreen
import com.newzarc.newzarcapp.views.screens.MyPostScreen
import com.newzarc.newzarcapp.views.screens.profile.ProfileScreen
import kotlinx.coroutines.launch

@Composable
fun DrawerNavBar(navController: NavController) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val currentScreen = remember { mutableStateOf(DrawerAppScreen.Main) }

    val coroutineScope = rememberCoroutineScope()

    ModalDrawer(
        drawerState = drawerState,
        gesturesEnabled = drawerState.isOpen,
        drawerContent = {
            DrawerContentComponent(
                currentScreen = currentScreen,
                closeDrawer = { coroutineScope.launch { drawerState.close() } },
                navController
            )
        },
        content = {
            BodyContentComponent(
                navController,
                currentScreen = currentScreen.value,
                openDrawer = {
                    coroutineScope.launch { drawerState.open() }
                }
            )
        }
    )
}

@Composable
fun DrawerContentComponent(
    currentScreen: MutableState<DrawerAppScreen>,
    closeDrawer: () -> Unit,
    navController: NavController
) {
    Column(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 15.dp)
        ) {
            Text(text = "Hello World")
            RoundedImageFromUrl(
                imageUrl = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg",
                modifier = Modifier
                    .size(100.dp) // Customize the size of the image
            )
        }
        for (index in DrawerAppScreen.values().indices) {
            val screen = getScreenBasedOnIndex(index)
            if (index != 0) {
                Column(Modifier.clickable(onClick = {
                    currentScreen.value = screen
                    closeDrawer()
                }), content = {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        color = if (currentScreen.value == screen) {
                            MaterialTheme.colors.secondary
                        } else {
                            MaterialTheme.colors.surface
                        }
                    ) {
                        Text(
                            text = if (screen.name == "MyPosts") "My Posts" else screen.name,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                })
            }
        }
    }
}

@Composable
fun RoundedImageFromUrl(imageUrl: String, modifier: Modifier = Modifier) {
    val painter = rememberImagePainter(
        data = imageUrl,
        builder = {
            crossfade(true)
        }
    )
    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .fillMaxSize()
            .then(Modifier.padding(4.dp))
            .aspectRatio(1f)
            .then(Modifier.padding(4.dp)),
        colorFilter = ColorFilter.tint(MaterialTheme.colors.onSurface),
//        shape = CircleShape,
    )
}


fun getScreenBasedOnIndex(index: Int) = when (index) {
    0 -> DrawerAppScreen.Main
    1 -> DrawerAppScreen.MyPosts
    2 -> DrawerAppScreen.Account
    else -> DrawerAppScreen.Main
}

@Composable
fun BodyContentComponent(
    navController: NavController,
    currentScreen: DrawerAppScreen,
    openDrawer: () -> Unit
) {

    val myviewmodel = hiltViewModel<NewsViewModel>()
    when (currentScreen) {
        DrawerAppScreen.Main -> MainScreen(openDrawer)
        DrawerAppScreen.Account -> ProfileScreen(navController, openDrawer)
        DrawerAppScreen.MyPosts -> MyPostScreen(navController,myviewmodel, openDrawer)
    }
}

enum class DrawerAppScreen {
    Main,
    Account,
    MyPosts
}

@Preview
@Composable
fun DrawerAppComponentPreview() {
    val navController = rememberNavController()
    DrawerNavBar(navController = navController)
}

package com.newzarc.newzarcapp.views.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.newzarc.newzarcapp.data.model.NewsEntity
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.screens.components.TopBar

@Composable
fun NewsScreen(
    navController: NavController?,
    myViewModel: NewsViewModel?,
    openDrawer: (() -> Unit)?
) {
    val viewModel = myViewModel?.getNews()?.observeAsState()
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(navController = navController, name = "Latest News", openDrawer)
        LazyColumn {
            if (viewModel?.value?.isNotEmpty() == true) {
                items(viewModel.value!!) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(horizontal = 15.dp, vertical = 10.dp)
                                .fillMaxWidth()
                        ) {
                            Column {

                                Text(
                                    modifier = Modifier
                                        .clickable {
                                            if (it.video_url == null) {
                                                it.video_url =
                                                    "https://download-video.akamaized.net/v2-1/playback/d5e1dec5-58e1-42fe-83b3-07c3116aa58a/c5b374ff?__token__=st=1690626902~exp=1690641302~acl=%2Fv2-1%2Fplayback%2Fd5e1dec5-58e1-42fe-83b3-07c3116aa58a%2Fc5b374ff%2A~hmac=310d918c75708cd742169e30ec25ec4e6486292534b1b90aa498b6475edc6d58&r=dXMtZWFzdDE%3D"
                                            }

                                            val news = NewsEntity(
                                                title = it.title,
                                                link = it.link,
                                                description = it.description,
                                                image_url = it.image_url,
                                                pubDate = it.pubDate,
                                                content = it.content,
                                                id_news = it.id_news,
                                                video_url = it.video_url
                                            )
                                            Log.d("myView", news.toString())
                                            navController?.currentBackStackEntry?.savedStateHandle?.set(
                                                key = "news",
                                                value = news
                                            )
                                            navController?.navigate("singleNewsScreen")
                                        },
                                    text = it.title,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                )
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = it.content,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis,
                                    fontSize = 18.sp,
                                )
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Right,
                                    text = it.pubDate,
                                    fontSize = 16.sp,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewzarcAppTheme {
        NewsScreen(null, null, null)
    }
}
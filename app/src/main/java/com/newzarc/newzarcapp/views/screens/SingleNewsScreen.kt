package com.newzarc.newzarcapp.views.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.newzarc.newzarcapp.R
import com.newzarc.newzarcapp.data.model.NewsEntity
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.views.screens.components.TopBar

@Composable
fun SingleNewsScreen(navController: NavController?, news: NewsEntity?, openDrawer: (() -> Unit)?) {

    Column {
        TopBar(
            navController = navController,
            name = (if (news.toString()
                    .isNotEmpty()
            ) news?.title?.substring(0, 15) + "..." else "News").toString(),
            openDrawer
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 15.dp, vertical = 10.dp),
            Alignment.Center
        ) {
            LazyColumn(
                modifier = Modifier
            ) {

//        Log.d("myViewSingle", news.toString())

                if (news != null) {
                    item {
                        Text(
                            modifier = Modifier,
                            text = news.title,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Right,
                            text = news.pubDate,
                            fontSize = 16.sp,
                        )
                        SingleNewsImage(news.image_url.toString())
//            SingleNewsImage("https://download-video.akamaized.net/v2-1/playback/d5e1dec5-58e1-42fe-83b3-07c3116aa58a/c5b374ff?__token__=st=1690626902~exp=1690641302~acl=%2Fv2-1%2Fplayback%2Fd5e1dec5-58e1-42fe-83b3-07c3116aa58a%2Fc5b374ff%2A~hmac=310d918c75708cd742169e30ec25ec4e6486292534b1b90aa498b6475edc6d58&r=dXMtZWFzdDE%3D")
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = news.content,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Justify
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = news.link,
                            color = Color.Blue,
                            fontSize = 16.sp,
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun SingleNewsImage(path: String) {
    Card {
        GlideImage(
            model = path,
            contentDescription = "Image",
            modifier = Modifier.padding(vertical = 5.dp)
        ) {
            it.error(R.drawable.ic_launcher_foreground)
                .placeholder(R.drawable.ic_launcher_background)
                .load(path)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SingleNewsPreview() {
    NewzarcAppTheme {
        SingleNewsScreen(null, null, null)
    }
}

package com.newzarc.newzarcapp.views.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.newzarc.newzarcapp.R
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.views.screens.components.TopBar


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MyPostScreen(navController: NavController?, openDrawer: () -> Unit) {
    var likeButton by remember {
        mutableStateOf<Boolean>(false)
    }
    var popupButton by remember {
        mutableStateOf<Boolean>(false)
    }

    Column {
        TopBar(navController, "My Posts", openDrawer)
        Column(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
                .fillMaxSize()
        ) {

            Card {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(
                        modifier = Modifier,
                        text = "Hello",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                    )
//                MyPostImage("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg")
//                Spacer(
//                    modifier = Modifier.padding(90.dp)
//                )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp),
                        Arrangement.SpaceBetween
                    ) {
                        if (likeButton) {
                            Image(
                                painterResource(R.drawable.red_ike_button),
                                contentDescription = "",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier
                                    .height(30.dp)
                                    .clickable(onClick = {
                                        likeButton = !likeButton
                                    })
                            )
                        } else {
                            Image(
                                painterResource(R.drawable.like_button),
                                contentDescription = "",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier
                                    .height(30.dp)
                                    .clickable(onClick = {
                                        likeButton = !likeButton
                                    })
                            )
                        }
                        Image(
                            painterResource(R.drawable.share_button),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.height(30.dp)
                        )
                    }
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(onClick = {
                                popupButton = !popupButton
                            }),
                        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 18.sp,
                    )
                    if (popupButton) {
                        Dialog(
                            onDismissRequest = {
                                popupButton = !popupButton
                            },
//                        properties = DialogProperties(
//                            usePlatformDefaultWidth = false
//                        )
                        ) {
                            PopUpContent({
                                popupButton = !popupButton
                            })
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun MyPostImage(path: String) {
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


@Composable
fun PopUpContent(function: () -> Unit) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 30.dp),
        shape = RoundedCornerShape(16.dp),
        color = Color.LightGray
    ) {
        Box(
//                contentAlignment = Alignment.Center,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
        ) {
            LazyColumn {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        Arrangement.SpaceBetween
                    ) {
                        Text(
                            modifier = Modifier,
                            text = "Hello",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                        )

                        Image(
                            painterResource(R.drawable.close_button),
                            contentDescription = "",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier
                                .height(30.dp)
                                .clickable(onClick = function)
                        )
                    }
//                    NewsImage("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg")
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Justify
                    )
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyPostScreenPreview() {
    NewzarcAppTheme {
        MyPostScreen(null, null!!)
    }
}
package com.newzarc.newzarcapp.views.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import androidx.navigation.compose.rememberNavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.newzarc.newzarcapp.R
import com.newzarc.newzarcapp.data.model.PostEntity
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.screens.components.RoundedImage
import com.newzarc.newzarcapp.views.screens.components.TopBar


@Composable
fun PostScreen(
    navController: NavController?,
    postsViewModel: NewsViewModel?,
    openDrawer: (() -> Unit)?
) {

    val viewModel = postsViewModel?.getPosts()?.observeAsState()

//    val viewModel = arrayOf(
//        PostEntity(
//            idPost = 7,
//            namePost = "Mizoram awaits Centre's assistance for providing shelter to 12,600 people from Manipur",
//            descriptionPost = "Mizoram officials say they haven't received any assistance from the Centre even after CM Zoramthanga had sought Rs 10 crore, in May, as an immediate relief package for displaced people. AIZWAL: The Mizoram government is still waiting for financial assistance from the Centre for providing shelter to over 12,600 people from ethnic strife-torn Manipur, a senior official said. Mizoram Home Commissioner and Secretary H Lalengmawia said that Chief Minister Zoramthanga had, in May, sought Rs 10 crore as an immediate relief package for those displaced people. \\\"We have not received any assistance from the Centre so far. The state government has raised funds on its own to provide relief to internally displaced people from Manipur,\\\" Lalengmawia told PTI on Sunday. He hoped that the Centre would soon sanction funds for these people, who have taken shelter in Mizoram after the ethnic violence broke out in the neighbouring state on May 3. Lalengmawia also said the Mizoram administration has solicited donations from legislators, government employees, bankers and others. \\\"We have completed the collection and I am yet to receive a report of the total collected amount,\\\" he said. According to the Mizoram home department, altogether 12,611 people from Manipur have taken shelter in the state till Friday. Of them, 4,440 took shelter in the Kolasib district, 4,265 in Aizawl and 2,951 in Saitual, it said. The remaining 955 are residing in Champhai, Mamit, Siaha, Lawngtlai, Lunglei, Serchhip, Khawzawl and Hnahthial districts. The government and village authorities have set up 38 relief camps in Aizawl, Kolasib and Saitual. The state government, NGOs, churches and villagers provided food and other basic items to the displaced people. Clashes first broke out in early May in Manipur after a 'Tribal Solidarity March' was organised in the hill districts to protest against the Meitei community's demand for Scheduled Tribe (ST) status. Meiteis account for about 53 per cent of Manipur's population and live mostly in the Imphal Valley. Tribals — Nagas and Kukis — constitute another 40 per cent of the population and reside in the hill districts.",
//            imageUrlPost = "fghjk",
//            likePost = 6,
//            user_id = 1,
//            name_user = "fghjk fghjk",
//            image_user = "fghjk",
//        )
//    )

//    Log.d("viewmodel", viewModel.value.toString())


    Column() {
//        TopBar(navController = navController, name = "Posts", openDrawer)

        Box(
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .fillMaxSize()
        ) {
            LazyColumn(modifier = Modifier.padding(bottom = 20.dp)) {
                if (viewModel?.value?.isNotEmpty() == true) {
                    items(viewModel.value!!) {

                        var likeButton by remember {
                            mutableStateOf<Boolean>(false)
                        }
                        var popupButton by remember {
                            mutableStateOf<Boolean>(false)
                        }
                        Card(modifier = Modifier.padding(vertical = 15.dp)) {
                            Column(
                                modifier = Modifier.padding(10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    Arrangement.SpaceBetween
                                ) {
                                    RoundedImage(it.image_user, 40)
                                    Text(
                                        modifier = Modifier,
                                        text = it.name_user,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 24.sp,
                                    )
                                }
//                                Text(
//                                    modifier = Modifier,
//                                    text = it.namePost,
//                                    fontWeight = FontWeight.Bold,
//                                    fontSize = 24.sp,
//                                )
//                                NewsImage("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg")
                                NewsImage(path = it.imageUrlPost)
//                                Spacer(
//                                    modifier = Modifier.padding(90.dp)
//                                )
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
                                    text = it.namePost,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis,
                                    fontSize = 18.sp,
                                )
                                if (popupButton) {
                                    Dialog(
                                        onDismissRequest = {
                                            popupButton = !popupButton
                                        },
                                    ) {
                                        PopUpPostContent(
                                            it
                                        ) { popupButton = !popupButton }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun PopUpPostContent(post: PostEntity, function: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 30.dp),
        shape = RoundedCornerShape(16.dp),
        color = Color.LightGray
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 5.dp),


            ) {
            LazyColumn {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                end = 10.dp,
                                top = 10.dp,
                                bottom = 5.dp
                            ),
                        Arrangement.End
                    ) {
                        Image(
                            painterResource(R.drawable.close_button),
                            contentDescription = "",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier
                                .height(30.dp)
                                .clickable(onClick = function)
//                                .align(Alignment.TopEnd)
                        )
                    }
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)) {
                        Text(
                            modifier = Modifier,
                            text = post.namePost,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                        )
//                    NewsImage("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg")
                        NewsImage(path = post.imageUrlPost)
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = post.descriptionPost,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Justify
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun NewsImage(path: String) {
    Card(modifier = Modifier.padding(vertical = 10.dp)) {
        GlideImage(
            model = path,
            contentDescription = "Image",
            modifier = Modifier
                .padding(vertical = 5.dp)
                .height(200.dp)
                .fillMaxWidth()
        ) {
            it.error(R.drawable.ic_launcher_foreground)
                .placeholder(R.drawable.ic_launcher_background)
                .load(path)
        }
    }
}



//@Preview(showBackground = true)
//@Composable
//fun PostScreenPreview() {
//    NewzarcAppTheme {
//        PostScreen()
//    }
//}
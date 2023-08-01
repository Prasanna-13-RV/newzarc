package com.newzarc.newzarcapp.views.screens.profile

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.newzarc.newzarcapp.R
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.views.screens.components.RoundedImage
import com.newzarc.newzarcapp.views.screens.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController, openDrawer: (() -> Unit)?) {
    var isupdatePassword = remember {
        mutableStateOf<Boolean>(false)
    }

    var password by remember {
        mutableStateOf("")
    }

    var oldPassword by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize()
    )
    {
        TopBar(navController,"Profile", openDrawer)
        Card(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
//            backgroundColor = Color.White,
//            elevation = 4.dp
        )
        {
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreateImageProfile()
                Divider()
                CreateInfo()
                Button(onClick = {
//                    Log.d("onClick", "Hello eeveryone")
//                    navController.navigate("updateProfileScreen")
                }) {
                    Text(text = "Update Your Profile")
                }
                if (isupdatePassword.value == true) {
                    AlertDialog(
                        onDismissRequest = { isupdatePassword.value = false },
                        confirmButton = {},
                        text = {
                            Column {
                                TextField(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 5.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    value = oldPassword,
                                    onValueChange = { ti -> oldPassword = ti },
                                    colors = TextFieldDefaults.textFieldColors(
                                        disabledIndicatorColor = Color.Transparent,
                                        focusedIndicatorColor = Color.Transparent,
                                        errorIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent
                                    ),
                                    placeholder = { Text(text = "Current Password") }
                                )
                                TextField(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 5.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    value = password,
                                    onValueChange = { ti -> password = ti },
                                    colors = TextFieldDefaults.textFieldColors(
                                        disabledIndicatorColor = Color.Transparent,
                                        focusedIndicatorColor = Color.Transparent,
                                        errorIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent
                                    ),
                                    placeholder = { Text(text = "New Password") }
                                )
                            }
                        }
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(top = 5.dp),
                    onClick = {
                        isupdatePassword.value = true
                    }
                ) {
                    Text(text = "Change the Password")
                }
            }
        }
    }
}

@Composable
fun CreateImageProfile(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(154.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(0.5.dp, Color.LightGray),
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
    ) {

//        RoundedImage(
//            path = "https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&w=1000&q=80",
//            size = 135
//        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "profile image",
            modifier = modifier.size(135.dp),
            contentScale = ContentScale.Crop
        )

    }
}

@Composable
fun CreateInfo() {
    Column(
        modifier = Modifier
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            color = Color.Blue,
            fontSize = 24.sp,
            style = MaterialTheme.typography.headlineSmall,
            text = "User name"
        )

        Text(
            text = "email",
            modifier = Modifier.padding(3.dp),
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "9876543210",
            modifier = Modifier.padding(3.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

//
//@Preview(showBackground = true)
//@Composable
//fun AccountPreview() {
//    NewzarcAppTheme {
//        ProfileScreen(null, null)
//    }
//}

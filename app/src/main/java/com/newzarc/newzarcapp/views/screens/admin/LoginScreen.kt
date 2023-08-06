package com.newzarc.newzarcapp.views.screens.admin

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.newzarc.newzarcapp.R
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.viewmodel.NewsViewModel
import com.newzarc.newzarcapp.views.screens.NewsScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController, viewModel: NewsViewModel) {
    Box(
        modifier = Modifier.paint(
            // Replace with your image id
            painterResource(id = R.drawable.news_background),
            contentScale = ContentScale.Crop
        )
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val email_user = remember { mutableStateOf(TextFieldValue()) }
            val password_user = remember { mutableStateOf(TextFieldValue()) }

            Text(text = "Login", style = TextStyle(fontSize = 40.sp))

            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                label = { Text(text = "Username") },
                value = email_user.value,
                onValueChange = { email_user.value = it })

            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                label = { Text(text = "Password") },
                value = password_user.value,
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = { password_user.value = it })

            val context = LocalContext.current
            Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
                Button(
                    onClick = {
                        viewModel.getUserByEmail(
                            email_user.value.text,
                            password_user.value.text,
                            context, navController
                        )
                            .also {
//                                Log.d("myuserlogin", it.toString())
//                                if (it?.isNotEmpty() == true) {
                                Toast.makeText(context, "Success in app", Toast.LENGTH_SHORT).show()
//                                navController.navigate("news")
//                                }
//                                else {
//                                    Toast.makeText(context, "Failed in app", Toast.LENGTH_SHORT).show()
//                                }
                            }
                    },
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(text = "Login")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
//            ClickableText(
//                text = AnnotatedString("Forgot password?"),
//                onClick = { },
//                style = TextStyle(
//                    fontSize = 14.sp,
//                    fontFamily = FontFamily.Default
//                )
//            )
            ClickableText(
                text = AnnotatedString("Sign up here"),
                modifier = Modifier
//                .align(Alignment.BottomCenter)
                    .padding(20.dp),
                onClick = {
                    navController.navigate("registerScreen")
                },
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Default,
                    textDecoration = TextDecoration.Underline,
//                color = Color(Purple700)
                )
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun NewsLoginPreview() {
//    NewzarcAppTheme {
//        LoginScreen(null)
//    }
//}

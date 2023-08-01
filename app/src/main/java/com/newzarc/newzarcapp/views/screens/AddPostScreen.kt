package com.newzarc.newzarcapp.views.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.newzarc.newzarcapp.ui.theme.NewzarcAppTheme
import com.newzarc.newzarcapp.views.screens.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddPostScreen(navController: NavController?, openDrawer: (() -> Unit)?) {

    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TopBar(navController, "Add Your Post", openDrawer)
        Column(
            modifier = Modifier
                .padding(
                    vertical = 10.dp,
                    horizontal = 15.dp
                ), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                shape = RoundedCornerShape(8.dp),
                value = title,
                onValueChange = { ti -> title = ti },
                colors = TextFieldDefaults.textFieldColors(
                    disabledIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                placeholder = { Text(text = "Title") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                shape = RoundedCornerShape(8.dp),
                value = description,
                onValueChange = { ti -> description = ti },
                colors = TextFieldDefaults.textFieldColors(
                    disabledIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                placeholder = { Text(text = "Description") },
                singleLine = false,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
                onClick = {}) {
                Text(text = "Add Arcs")
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun AddScreenPreview() {
    NewzarcAppTheme {
        AddPostScreen(null, null)
    }
}
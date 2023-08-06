package com.newzarc.newzarcapp.viewmodel.network

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun InternetConnectionPopup(onDismiss: () -> Unit, status: String) {
    if (status == "Unavailable" || status == "Losing" || status == "Lost") {
        Dialog(
            onDismissRequest = onDismiss
        ) {
            AlertDialog(
                onDismissRequest = onDismiss,
                title = {
                    Text(
                        text = "Internet Connection Lost",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.Black
                    )
                },
                text = {
                    Text(
                        text = "Please check your internet connection and try again. \n" +
                                " Status : $status",
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                },
                confirmButton = {
                    // You can add a "Retry" button here to attempt reconnection.
                }
            )
        }
    }
}
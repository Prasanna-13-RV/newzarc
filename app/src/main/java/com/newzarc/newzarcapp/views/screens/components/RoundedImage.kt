package com.newzarc.newzarcapp.views.screens.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.newzarc.newzarcapp.R

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RoundedImage(path: String, size : Int) {
    Card() {
        GlideImage(
            model = if(path == null) "https://images.unsplash.com/photo-1511367461989-f85a21fda167?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&w=1000&q=80" else path,
            contentDescription = "Image",
            modifier = Modifier
                .padding(vertical = 5.dp)
                .height(size.dp)
                .width(size.dp)
                .clip(RoundedCornerShape(size.dp))
        ) {
            it.error(R.drawable.ic_launcher_foreground)
                .placeholder(R.drawable.ic_launcher_background)
                .load(path)
        }
    }
}
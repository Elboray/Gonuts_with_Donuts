package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gonutswithdonuts.R
import com.example.gonutswithdonuts.ui.theme.Pink

@Composable
fun BackgroundForDetailsScreen() {
    Image(

        painter = painterResource(id = R.drawable.backgrounddonutsdetails),
        contentDescription = null,
        contentScale = ContentScale.FillBounds, modifier = Modifier
            .height(442.dp)
            .fillMaxWidth()
            .background(color = Pink)
    )
}
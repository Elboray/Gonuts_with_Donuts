package com.example.gonutswithdonuts.ui.screens.donuts_home

import SpacerHorizontal4Dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonutswithdonuts.R

@Preview
@Composable
fun BottomAppBarCompose() {
    BottomAppBar(
        modifier = Modifier.padding(top = 800.dp)
            .fillMaxWidth()
            .background(
                color = Color.White,
            ), containerColor = Color.White

    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(22.dp, Alignment.CenterHorizontally),
        ) {
            Image(

                painter = painterResource(id = R.drawable.home),
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(start = 24.dp),
            )
            SpacerHorizontal4Dp()
            Image(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = null,
                contentScale = ContentScale.None
            )
            SpacerHorizontal4Dp()
            Row(
            ) {
                Image(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = null,
                    contentScale = ContentScale.None
                )

            }
            SpacerHorizontal4Dp()
            Image(
                painter = painterResource(id = R.drawable.buy),
                contentDescription = null,
                contentScale = ContentScale.None
            )
            SpacerHorizontal4Dp()
            Image(
                painter = painterResource(id = R.drawable.mingcute_user_2_line),
                contentDescription = null,
                contentScale = ContentScale.None
            )
        }

    }
}
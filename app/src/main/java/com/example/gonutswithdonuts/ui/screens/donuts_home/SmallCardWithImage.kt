package com.example.gonutswithdonuts.ui.screens.donuts_home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonutswithdonuts.R


@Composable
fun SmallCardWithImage(image: List<Int>) {
    Box() {

        Card(
            modifier = Modifier
                .padding(end = 16.dp)
                .shadow(
                    elevation = 40.dp,
                    spotColor = Color(0x1A000000),
                    ambientColor = Color(0x1A000000)
                )
                .width(220.dp)
                .height(150.dp)
                .background(
                    color = Color(0xFFD7E4F6),
                    shape = RoundedCornerShape(size = 20.dp)
                )
        ) {
            Box() {
                Image(
                    painterResource(image[0]),
                    contentDescription = null,
                    modifier = Modifier.offset(x = 10.dp, y = 0.dp)
                        .width(100.dp)
                        .height(100.dp),
                    contentScale = ContentScale.FillBounds,
                )
            }

        }

        Text(
            modifier = Modifier
                .offset(x = 10.dp, y = 100.dp)
                .wrapContentSize()
                .height(17.dp),
            text = "Chocolate Cherry",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.inter_medium)),
                fontWeight = FontWeight(500),
                color = Color(0x99000000),
            )
        )

        Text(
            modifier = Modifier
                .offset(x = 55.dp, y = 120.dp)
                .wrapContentSize()
                .height(17.dp),
            text = "$22",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                fontWeight = FontWeight(600),
                color = Color(0xFFFF7074),
            )
        )
    }


}


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
fun CardWithImage(image: List<Int>) {
    Box() {

        Card(
            modifier = Modifier
                .padding(end = 16.dp)
                .shadow(
                    elevation = 40.dp,
                    spotColor = Color(0x1A000000),
                    ambientColor = Color(0x1A000000)
                )
                .width(250.dp)
                .height(325.dp)
                .background(
                    color = Color(0xFFD7E4F6),
                    shape = RoundedCornerShape(size = 20.dp)
                )
        ) {
            Box() {
                Image(
                    painterResource(id = image.get(index = 0)),
                    contentDescription = null,
                    modifier = Modifier
                        .width(250.dp)
                        .height(200.dp).padding(start = 64.dp),
                    contentScale = ContentScale.FillBounds,
                )
            }

        }
        Image(
            painter = painterResource(id = R.drawable.ic_round_fav),
            contentDescription = null,
            contentScale = ContentScale.None,
            modifier = Modifier
                .offset(x = 16.dp, y = 16.dp)
                .width(35.dp)
                .height(35.dp)
                .background(color = Color.White, shape = RoundedCornerShape(size = 24.dp))
                .clickable { }, alignment = Alignment.Center
        )
        Text(
            modifier = Modifier
                .offset(x = 24.dp, y = 205.dp)
                .wrapContentSize()
                .height(19.dp),
            text = "Strawberry Wheel",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                fontWeight = FontWeight(500),
            )
        )
        Text(
            modifier =Modifier
                .offset(x = 24.dp, y = 233.dp)
                .width(157.dp)
                .height(45.dp),
            text = "These Baked Strawberry Donuts are filled with fresh strawberries...",
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                fontWeight = FontWeight(400),
                color = Color(0x99000000),
                letterSpacing = 0.6.sp,
            )
        )
        Text(
            modifier = Modifier
                .offset(x = 140.dp, y = 291.dp)
                .width(28.dp)
                .height(17.dp),
            text = "$20",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                fontWeight = FontWeight(600),
                color = Color(0x99000000),
                textDecoration = TextDecoration.LineThrough,
            )
        )


        Text(
            modifier = Modifier
                .offset(x = 172.dp, y = 283.dp)
                .width(40.dp)
                .height(27.dp),
            text = "$16",
            style = TextStyle(
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                fontWeight = FontWeight(600),
            )
        )

    }


}


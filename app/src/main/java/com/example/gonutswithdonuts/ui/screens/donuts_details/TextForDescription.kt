package com.example.cinematickets.ui.details_screen

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonutswithdonuts.R

@Composable
fun TextForDescription() {
    Text(
        modifier = Modifier
            .offset(x = 40.dp, y = 578.dp)
            .width(348.dp)
            .height(85.dp),
        text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
        style = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.inter_regular)),
            fontWeight = FontWeight(400),
            color = Color(0x99000000),
            letterSpacing = 0.7.sp,
        )
    )
}
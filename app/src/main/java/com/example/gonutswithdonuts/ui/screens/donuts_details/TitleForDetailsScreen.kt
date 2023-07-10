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
fun TitleForDetailsScreen() {
    Text(
        modifier = Modifier
            .offset(x = 40.dp, y = 0.dp)
            .width(263.dp)
            .height(36.dp),
        text = "Strawberry Wheel",
        style = TextStyle(
            fontSize = 30.sp,
            fontFamily = FontFamily(Font(R.font.inter_bold)),
            fontWeight = FontWeight(600),
            color = Color(0xFFFF7074),
        )
    )
}
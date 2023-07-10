package com.example.cinematickets.ui.details_screen

import SpacerHorizontal64Dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.gonutswithdonuts.ui.theme.Pink

@Composable
fun ButtonForAddToCard() {
    Row() {
        Text(
            modifier = Modifier
                .offset(x = 40.dp, y = 837.dp)
                .width(54.dp)
                .height(36.dp),
            text = "£16",
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                fontWeight = FontWeight(600),
            )
        )
        SpacerHorizontal64Dp()
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Pink),
            modifier = Modifier
                .padding(bottom = 16.dp, start = 100.dp)
        ) {
            Text(
                modifier = Modifier
                    .offset(x = 76.dp, y = 22.dp)
                    .width(116.dp)
                    .height(24.dp),
                text = "Add to Cart",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                )
            )


        }

    }
}
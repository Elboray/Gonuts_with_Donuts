package com.example.cinematickets.ui.details_screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TextForDetailsScreen(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        color = Color(0xDE000000),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight(500),
    )

}
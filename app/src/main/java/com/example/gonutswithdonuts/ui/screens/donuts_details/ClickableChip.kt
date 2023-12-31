package com.example.gonutswithdonuts.ui.screens.donuts_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClickableChip(
    label: String,
    selected: Boolean,
    onChipChange: (String) -> Unit
) {

    SuggestionChip(onClick = {
        if (!selected)
            onChipChange(label)
        else
            onChipChange("")
    }, label = {
        Text(
            modifier = Modifier.padding(all = 3.dp),
            fontSize = 24.sp,
            text = label,
            textAlign = TextAlign.Center,
            color = if (selected) Color.White else Color.Black
        )
    },
        modifier = Modifier
            .width(45.dp)
            .height(45.dp)
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(size = 15.dp)
            ),
        colors = SuggestionChipDefaults.suggestionChipColors(
            containerColor = if (selected) Color.Black else Color.Transparent,

            ),
        border = SuggestionChipDefaults.suggestionChipBorder(
            borderColor = if (selected) Color.White else Color.White
        )
    )

}
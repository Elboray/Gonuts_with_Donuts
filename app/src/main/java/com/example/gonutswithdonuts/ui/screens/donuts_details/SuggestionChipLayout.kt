package com.example.gonutswithdonuts.ui.screens.donuts_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SuggestionChipLayout() {

    val chipsData by remember { mutableStateOf(listOf("-", "1","+")) }
    var chipState by remember { mutableStateOf("") }

    Row(
        modifier = Modifier.offset(x = 20.dp, y = 290.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Row(
            modifier = Modifier

                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            chipsData.forEach {
                ClickableChip(label = it, selected = it == chipState) { chip ->
                    chipState = chip
                }
            }
        }
    }

}
package com.example.gonutswithdonuts.ui.screens.donuts_details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gonutswithdonuts.R
import com.example.gonutswithdonuts.ui.theme.Pink_Bold

@Composable
fun IconBack(onClickBack:()->Unit) {
    Icon(

        painter = painterResource(id = R.drawable.ic_round_arrow_back_ios),
        contentDescription = null,
        modifier = Modifier
            .offset(x = 32.dp, y = 45.dp)
            .width(30.dp)
            .height(30.dp).clickable { onClickBack() },
        tint = Pink_Bold,

        )
}
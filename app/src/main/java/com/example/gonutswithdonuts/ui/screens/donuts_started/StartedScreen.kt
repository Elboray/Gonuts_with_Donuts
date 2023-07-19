package com.example.gonutswithdonuts.ui.screens.donuts_started

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gonutswithdonuts.R
import com.example.gonutswithdonuts.ui.composable.Screen
import com.example.gonutswithdonuts.ui.theme.Pink
@Composable
fun OnBoardingScreen(
    navController: NavController,
) {
     OnBoardingScreenContent(
         onClickButton = { navController.navigate(Screen.HomeScreen.route) }
    )
}
@Composable
fun OnBoardingScreenContent(
    onClickButton: ()->Unit
) {
    Image(

        painter = painterResource(id = R.drawable.backgrounddonuts),
        contentDescription = null,
        contentScale = ContentScale.FillBounds, modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(color = Pink)
            .padding(bottom = 350.dp)
    )
    Text(
        modifier = Modifier
            .offset(x = 40.dp, y = 430.dp)
            .width(193.dp)
            .height(195.dp),
        text = "Gonuts with Donuts",
        style = TextStyle(
            fontSize = 54.sp,
            fontFamily = FontFamily(Font(R.font.inter_bold)),
            fontWeight = FontWeight(700),
            color = Color(0xFFFF7074),

            )

    )
    Text(
        modifier = Modifier
            .offset(x = 40.dp, y = 640.dp)
            .width(348.dp)
            .height(88.dp),
        text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
        style = TextStyle(
            fontSize = 18.sp,
            fontFamily = FontFamily(Font(R.font.inter_regular)),
            fontWeight = FontWeight(500),
            color = Color(0xFFFF9494),
        )
    )
    Button(onClick = {onClickButton() },
        modifier = Modifier
        .offset(x = 40.dp, y = 800.dp)
        .width(348.dp)
        .height(67.dp)
        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 50.dp))
    , colors = ButtonDefaults.buttonColors(Color.White)
    ) {

        Text(
            text = "Get Started",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                fontWeight = FontWeight(600),
                color = Color.Black
            )
        )
    }
    Image(
        modifier=Modifier
            .offset(x = (-19).dp, y = (-39).dp)
            .width(186.dp)
            .height(186.dp),
        painter = painterResource(id = R.drawable.perple),
        contentDescription = "image description",
        contentScale = ContentScale.FillBounds
    )
    Image(
        modifier=Modifier
            .offset(x = 160.dp, y = 30.dp)
            .width(210.dp)
            .height(155.dp),
        painter = painterResource(id = R.drawable.donutone),
        contentDescription = "image description",
        contentScale = ContentScale.FillBounds
    )
    Image(
        modifier=Modifier
            .offset(x = 27.dp, y = 284.dp)
            .width(94.dp)
            .height(69.dp),
        painter = painterResource(id = R.drawable.donuttwo),
        contentDescription = "image description",
        contentScale = ContentScale.FillBounds
    )
    Image(
        modifier=Modifier
            .offset(x = 290.dp, y = 390.dp)
            .width(209.dp)
            .height(165.dp),
        painter = painterResource(id = R.drawable.cake),
        contentDescription = "image description",
        contentScale = ContentScale.FillBounds
    )

}
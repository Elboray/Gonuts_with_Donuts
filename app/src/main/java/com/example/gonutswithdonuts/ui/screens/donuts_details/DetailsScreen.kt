package com.example.gonutswithdonuts.ui.screens.donuts_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cinematickets.ui.details_screen.BackgroundForDetailsScreen
import com.example.gonutswithdonuts.R
import com.example.gonutswithdonuts.ui.theme.Pink
import com.example.gonutswithdonuts.ui.theme.Pink_Bold
@Composable
fun DetailsScreen(
    navController: NavController,
) {
    DetailsScreenContent( onClickBack = { navController.navigateUp() })
}
@Composable
fun DetailsScreenContent(onClickBack: () -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxSize().fillMaxWidth(), contentAlignment = Alignment.TopCenter
    ) {

        BackgroundForDetailsScreen()

    }

    Box(
        modifier = Modifier
            .offset(x = (-0.00001).dp, y = 400.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(
                    topStart = 40.dp,
                    topEnd = 40.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp
                )
            ), contentAlignment = Alignment.TopStart
    ) {

        Text(
            modifier = Modifier
                .offset(x = 40.dp, y = 35.dp)
                .wrapContentSize()
                .height(36.dp),
            text = "Strawberry Wheel",
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                fontWeight = FontWeight(600),
                color = Color(0xFFFF7074),
            )
        )
        Text(
            modifier = Modifier
                .offset(x = 38.dp, y = 104.dp)
                .wrapContentSize()
                .height(22.dp),
            text = "About Gonut",
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                fontWeight = FontWeight(500),
                color = Color(0xCC000000),
            )
        )
        Text(
            modifier = Modifier
                .offset(x = 40.dp, y = 142.dp)
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
        Text(
            modifier = Modifier
                .offset(x = 40.dp, y = 253.dp)
                .wrapContentSize()
                .height(22.dp),
            text = "Quantity",
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                fontWeight = FontWeight(500),
                color = Color(0xCC000000),
            )
        )
        SuggestionChipLayout()
        Row(modifier = Modifier.padding(top = 370.dp, start = 40.dp).fillMaxWidth().fillMaxSize(), horizontalArrangement = Arrangement.Center  ) {
            Text(
                modifier = Modifier
                    .width(54.dp)
                    .height(36.dp),
                text = "£16",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.inter_bold)),
                    fontWeight = FontWeight(600),
                ), textAlign = TextAlign.Center
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Pink_Bold),
                modifier = Modifier.padding(start = 26.dp)
                    .width(250.dp)
                    .height(67.dp)
                    .background(color = Color(0xFFFF7074),
                        shape = RoundedCornerShape(size = 50.dp)

                    )
,
            ) {
                Text(
                    modifier = Modifier
                        .wrapContentSize()
                        .wrapContentHeight(),
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

    Image(
        painter = painterResource(id = R.drawable.ic_round_fav),
        contentDescription = null,
        contentScale = ContentScale.None,
        modifier = Modifier
            .offset(x = 320.dp, y = 380.dp)
            .width(45.dp)
            .height(45.dp)
            .background(color = Color.White, shape = RoundedCornerShape(size = 15.dp))
            .clickable { }
    )
    IconBack { onClickBack() }
}


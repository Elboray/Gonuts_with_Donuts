package com.example.gonutswithdonuts.ui.screens.donuts_home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gonutswithdonuts.R
import com.example.gonutswithdonuts.ui.composable.Screen
import com.example.gonutswithdonuts.ui.theme.Blue
import com.example.gonutswithdonuts.ui.theme.Pink
import com.example.gonutswithdonuts.ui.theme.Pink_Bold
@Composable
fun HomeScreen(
    navController: NavController,
) {
    HomeScreenContent(
        onClickCard = { navController.navigate(Screen.DetailsScreen.route) }
    )
}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreenContent(onClickCard: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .fillMaxSize()
            .padding(top = 48.dp), horizontalAlignment = Alignment.Start
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column() {
                Text(
                    modifier = Modifier
                        .offset(x = 38.dp, y = 0.dp)
                        .wrapContentSize()
                        .height(36.dp),
                    text = "Let’s Gonuts!",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontFamily = FontFamily(Font(R.font.inter_bold)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFF7074),
                    )
                )
                Text(
                    modifier = Modifier
                        .offset(x = 39.dp, y = 0.dp)
                        .wrapContentSize()
                        .height(17.dp),
                    text = "Order your favourite donuts from here",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter_regular)),
                        fontWeight = FontWeight(500),
                        color = Color(0x99000000),
                    )
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_round_search),
                contentDescription = null,
                contentScale = ContentScale.None,
                modifier = Modifier
                    .offset(x = 100.dp, y = 0.dp)
                    .width(45.dp)
                    .height(45.dp)
                    .background(color = Color(0xFFFED8DF), shape = RoundedCornerShape(size = 15.dp))
                    .clickable { }
            )

        }

        Text(
            modifier = Modifier
                .offset(x = 39.dp, y = 54.dp)
                .wrapContentSize()
                .height(24.dp),
            text = "Today Offers",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                fontWeight = FontWeight(600),
            )
        )
        val image = listOf(
            R.drawable.donuts,
            R.drawable.strawberrydonuts,
            R.drawable.donutsimagecard,
            R.drawable.strawberrydonuts,
            R.drawable.donutsimagecard,
            R.drawable.donutsimagecard,
            R.drawable.donuts,
            R.drawable.strawberrydonuts,
            R.drawable.donutsimagecard,
            R.drawable.strawberrydonuts,
            R.drawable.donutsimagecard,
            R.drawable.donutsimagecard
        )
        val color = listOf(
            Blue,
            Pink,
            Pink_Bold,
            Color.White,
            Color.Transparent,
            Color.Cyan,
            Blue,
            Pink,
            Pink_Bold,
            Color.White,
            Color.Transparent,
            Color.Cyan
        )
        val names = listOf(
            "Chocolate Cherry",
            "Strawberry Wheel",
            "Chocolate Cherry",
            "Strawberry Wheel",
            "Chocolate Cherry",
            "Strawberry Wheel",
            "Chocolate Cherry",
            "Strawberry Wheel",
            "Chocolate Cherry",
            "Strawberry Wheel",
            "Chocolate Cherry",
            "Strawberry Wheel",
            "Chocolate Cherry",
        )
        val pagerState = rememberPagerState()
        HorizontalPager(
            pageCount = image.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 39.dp),
            modifier = Modifier
                .wrapContentSize()
                .wrapContentHeight()
                .padding(top = 80.dp),
            verticalAlignment = Alignment.CenterVertically,
            pageSize = PageSize.Fixed(240.dp)
        )
        { index ->
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
                            color = color[1],
                            shape = RoundedCornerShape(size = 20.dp)
                        ).clickable { onClickCard() }, colors = CardDefaults.cardColors(color[index])
                ) {
                    Box() {
                        Image(
                            painterResource(id = image[index]),
                            contentDescription = null,
                            modifier = Modifier
                                .width(250.dp)
                                .height(200.dp)
                                .padding(start = 64.dp),
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
                    text = names[index],
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                        fontWeight = FontWeight(500),
                    )
                )
                Text(
                    modifier = Modifier
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

        Text(
            modifier = Modifier
                .offset(x = 39.dp, y = 20.dp)
                .width(70.dp)
                .height(24.dp),
            text = "Donuts",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter_regular)),
                fontWeight = FontWeight(600),
            )
        )

        HorizontalPager(
            pageCount = 10,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 39.dp),
            modifier = Modifier
                .wrapContentSize()
                .wrapContentHeight()
                .padding(top = 35.dp),
            verticalAlignment = Alignment.CenterVertically,
            pageSize = PageSize.Fixed(150.dp)
        )
        { index ->
            Box() {

                Card(
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .shadow(
                            elevation = 40.dp,
                            spotColor = Color(0x1A000000),
                            ambientColor = Color(0x1A000000)
                        )
                        .width(220.dp)
                        .height(150.dp)
                        .background(
                            color = Color(0xFFD7E4F6),
                            shape = RoundedCornerShape(size = 20.dp)
                        ).clickable { onClickCard() }, colors = CardDefaults.cardColors(Color.White)
                ) {
                    Box() {
                        Image(
                            painterResource(image[index]),
                            contentDescription = null,
                            modifier = Modifier
                                .offset(x = 10.dp, y = 0.dp)
                                .width(100.dp)
                                .height(100.dp),
                            contentScale = ContentScale.FillBounds,
                        )
                    }

                }

                Text(
                    modifier = Modifier
                        .offset(x = 10.dp, y = 100.dp)
                        .wrapContentSize()
                        .height(17.dp),
                    text = names[index],
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter_medium)),
                        fontWeight = FontWeight(500),
                        color = Color(0x99000000),
                    )
                )

                Text(
                    modifier = Modifier
                        .offset(x = 55.dp, y = 120.dp)
                        .wrapContentSize()
                        .height(17.dp),
                    text = "$22",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFF7074),
                    )
                )
            }
        }


    }
    BottomAppBarCompose()
}
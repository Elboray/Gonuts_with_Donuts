package com.example.gonutswithdonuts.ui.composable

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gonutswithdonuts.ui.screens.donuts_details.DetailsScreen
import com.example.gonutswithdonuts.ui.screens.donuts_home.HomeScreen
import com.example.gonutswithdonuts.ui.screens.donuts_started.OnBoardingScreen
import com.example.gonutswithdonuts.ui.theme.GonutsWithDonutsTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationView() {
    GonutsWithDonutsTheme {
        Scaffold {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Screen.OnBoarding.route) {
                composable(Screen.OnBoarding.route) {
                    OnBoardingScreen(navController)
                }
                composable(Screen.DetailsScreen.route) {
                    DetailsScreen(navController)
                }
                composable(Screen.HomeScreen.route) {
                    HomeScreen(navController)
                }
            }
        }

    }
}
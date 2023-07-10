package com.example.gonutswithdonuts.ui.composable


sealed class Screen(val route: String) {
    object HomeScreen : Screen("homeScreen")
    object DetailsScreen : Screen("detailsScreen")
    object OnBoarding : Screen("onboard")
}
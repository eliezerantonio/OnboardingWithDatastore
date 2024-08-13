package com.example.onboardingwithdatastore.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onboardingwithdatastore.dataStore.StoreBoarding
import com.example.onboardingwithdatastore.onBoardViews.MainOnboarding
import com.example.onboardingwithdatastore.views.HomeView
import com.example.onboardingwithdatastore.views.SplashScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NavManager() {
val context = LocalContext.current
    val dataStore = StoreBoarding(context)
    val store = dataStore.getBOARDING.collectAsState(initial = false)

    val navController = rememberNavController()

    NavHost(navController, startDestination = if (store.value) "Home" else "Splash") {

        composable("OnBoarding") {
            MainOnboarding(navController, dataStore)
        }
        composable("Home") {
            HomeView(navController)
        }
        
        composable("Splash"){
            SplashScreen(navController = navController, store.value)
        }
    }


}
package com.example.onboardingwithdatastore.views

import android.widget.Space
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.onboardingwithdatastore.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController, store:Boolean) {
    var screen by remember { mutableStateOf("") }
    screen = if (store){"Home"} else {"Onboarding"}

    LaunchedEffect(key1 = true) {
        delay(2000)
        navController.navigate(screen) {
            popUpTo(0)
        }

    }


    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
      Column {
          Image(painter = painterResource(id = R.drawable.splash), contentDescription = "logo")
          Spacer(Modifier.height(10.dp))

          CircularProgressIndicator()
      }



    }
}
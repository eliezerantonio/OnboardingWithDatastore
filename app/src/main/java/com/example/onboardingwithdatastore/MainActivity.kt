package com.example.onboardingwithdatastore

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.onboardingwithdatastore.navigation.NavManager
import com.example.onboardingwithdatastore.onBoardViews.MainOnboarding
import com.example.onboardingwithdatastore.ui.theme.OnboardingWithDatastoreTheme

@ExperimentalFoundationApi
@OptIn(ExperimentalFoundationApi::class)
class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OnboardingWithDatastoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                 NavManager()
                }
            }
        }
    }
}

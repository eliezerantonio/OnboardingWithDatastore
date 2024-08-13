@file:OptIn(ExperimentalPagerApi::class)

package com.example.onboardingwithdatastore.onBoardViews

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.onboardingwithdatastore.R
import com.example.onboardingwithdatastore.data.PageData
import com.example.onboardingwithdatastore.dataStore.StoreBoarding

import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState


@ExperimentalFoundationApi
@Composable
fun MainOnboarding(navController: NavController, store:StoreBoarding) {


    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            title = "Title 1",
            desc = "Lorem impos il will be a batter developer form mobile ecossstem"
        ),
    )

    items.add(
        PageData(
            R.raw.page2,
            title = "Title 2",
            desc = "Lorem impos il will be a batter developer form mobile ecossstem"
        ),
    )
    items.add(
        PageData(
            R.raw.page3,
            title = "Title 3",
            desc = "Lorem impos il will be a batter developer form mobile ecossstem"
        ),
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialPage = 0,
        initialOffscreenLimit = 2,
        infiniteLoop = false
    )

    OnBoardingPager(
        items = items, pagerState = pagerState, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        navController, store
    )
}
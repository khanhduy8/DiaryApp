package com.minix.diaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.minix.diaryapp.navigation.SetupNavigationGraph
import com.minix.diaryapp.ui.theme.DiaryAppTheme
import com.minix.diaryapp.navigation.Screen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            DiaryAppTheme {
                val navController = rememberNavController()
                SetupNavigationGraph(startDestination = Screen.Authentication.route, navController = navController)
            }
        }
    }
}
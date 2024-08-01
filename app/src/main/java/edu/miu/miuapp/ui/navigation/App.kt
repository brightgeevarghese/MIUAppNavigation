package edu.miu.miuapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.miu.miuapp.ui.screens.ContactScreen
import edu.miu.miuapp.ui.screens.HomeScreen
import edu.miu.miuapp.ui.screens.ProgramsScreen

@Composable
fun App(navHostController: NavHostController, modifier: Modifier = Modifier) {
    //Create NavHost - responsible for managing navigation within the app
    NavHost(navController = navHostController, startDestination = "home") {
        //NavGraphBuilder - responsible for defining the navigation graph
        composable("home") {
            HomeScreen(navController = navHostController, modifier = modifier)
        }
        composable("programs") {
            ProgramsScreen(navController = navHostController, modifier = modifier)
        }
        composable("contact") {
            ContactScreen(navController = navHostController, modifier = modifier)
        }
    }
}
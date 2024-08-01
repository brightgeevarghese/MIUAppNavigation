package edu.miu.miuapp.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.miu.miuapp.ui.components.TopBar
import edu.miu.miuapp.ui.screens.ContactScreen
import edu.miu.miuapp.ui.screens.HomeScreen
import edu.miu.miuapp.ui.screens.ProgramsScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar(navController = navController) }
    ) { innerPadding ->
        //Create NavHost - responsible for managing navigation within the app
        NavHost(navController = navController, startDestination = "home") {
            //NavGraphBuilder - responsible for defining the navigation graph
            composable("home") {
                HomeScreen(navController = navController, modifier = Modifier.padding(innerPadding))
            }
            composable("programs") {
                ProgramsScreen(navController = navController, modifier = Modifier.padding(innerPadding))
            }
            composable("contact") {
                ContactScreen(navController = navController, modifier = Modifier.padding(innerPadding))
            }
        }
    }

}
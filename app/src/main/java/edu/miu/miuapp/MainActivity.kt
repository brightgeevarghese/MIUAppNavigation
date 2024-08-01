package edu.miu.miuapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.miu.miuapp.ui.components.TopBar
import edu.miu.miuapp.ui.navigation.NavigationGraph
import edu.miu.miuapp.ui.theme.MIUAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController: NavHostController = rememberNavController()
            MIUAppTheme {
                NavigationGraph(navController = navController)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MIUAppPreview() {
    val navController: NavHostController = rememberNavController()
    MIUAppTheme {
        NavigationGraph(navController = navController)
    }
}
package edu.miu.miuapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.miu.miuapp.components.TopBar
import edu.miu.miuapp.ui.App
import edu.miu.miuapp.ui.theme.MIUAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController: NavHostController = rememberNavController()
            MIUAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { TopBar(navController) }
                ) { innerPadding ->
                    App(navController, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MIUAppPreview() {
    MIUAppTheme {
        val navController: NavHostController = rememberNavController()
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopBar(navController) }
        ) { innerPadding ->
            App(navController, modifier = Modifier.padding(innerPadding))
        }
    }
}
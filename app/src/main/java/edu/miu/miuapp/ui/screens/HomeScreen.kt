package edu.miu.miuapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Welcome to Maharishi International University")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("programs") }) {
            Text(text = "View Programs")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("contact") }) {
            Text(text = "Contact Us")
        }
    }
}
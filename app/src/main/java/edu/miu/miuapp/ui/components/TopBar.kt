package edu.miu.miuapp.ui.components

import android.os.Bundle
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navController: NavController, modifier: Modifier = Modifier) {
    var canNavigateBack by remember {
        mutableStateOf(false)
    }
    navController.addOnDestinationChangedListener { controller, destination, arguments ->
        canNavigateBack = destination.route != "home"
    }
    TopAppBar(
        title = { Text(text = "MIU App") },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        navigationIcon = {
            val navIcon = if (canNavigateBack) {
                Icons.AutoMirrored.Default.ArrowBack
            } else {
                Icons.Default.Home
            }
            IconButton(onClick = { if (canNavigateBack) navController.navigateUp() }) {
                Icon(imageVector = navIcon, contentDescription = "Nav Icon")
            }
        }
    )
}


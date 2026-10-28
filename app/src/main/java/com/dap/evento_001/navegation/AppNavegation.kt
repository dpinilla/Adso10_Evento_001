package com.dap.evento_001.navegation

import android.provider.ContactsContract
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dap.evento_001.view.MenuScreen
import com.dap.evento_001.view.suma.SumaScreen

@Composable
fun AppNavegation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home") {
        composable("home") {
            MenuScreen(
                onGoSuma = { navController.navigate("suma")},
                //onGoResta = { navController.navigate("resta")}
            )
        }
        composable ("suma") {
            SumaScreen()
        }
    }
}
package com.example.learnnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyNavigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routs.screenA) {
        composable(Routs.screenA){
            Screen_1(navController)
        }
        composable(Routs.screenB+"/{name}"){
            var name = it.arguments?.getString("name")
            Screen_2(name)
        }

    }

}
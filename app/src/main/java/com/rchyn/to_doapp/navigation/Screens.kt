package com.rchyn.to_doapp.navigation

import androidx.navigation.NavHostController
import com.rchyn.to_doapp.util.Action
import com.rchyn.to_doapp.util.Constants.LIST_SCREEN

class Screens(
    navController: NavHostController
) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) {
                inclusive = true
            }
        }
    }

    val task: (Int) -> Unit = {taskId ->
        navController.navigate("task/$taskId")
    }
}
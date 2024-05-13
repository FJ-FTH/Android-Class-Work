package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme

class index : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {
            }
        }
    }
}
@Composable
fun Navigator(){
// val navController = rememberNavController()
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){ HomePage(navController)}
        composable("A"){ Apage(navController) }
        composable("B"){ Bpage(navController) }
        composable("C"){ Cpage(navController) }


    }
}

@Composable
fun HomePage(navController: NavController){
    Column {
        Button(onClick = {
            navController.navigate("A")
        }) {
            Text(text="A")
        }
        Button(onClick = {
            navController.navigate("B")
        }) {
            Text(text="B")
        }
        Button(onClick = {
            navController.navigate("C")
        }) {
            Text(text="C")
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun PrevieHost(){
    Navigator()
}

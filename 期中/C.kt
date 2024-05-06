
package com.example.middleexam

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController


@Composable
fun Cpage(navController: NavController){
    Column {


        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }
}


//class C : ComponentActivity(){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val exitButton:Button = findViewById(R.id.login_out)
//        exitButton.setOnClickListener {
//            finish()
//        }
//    }
//}
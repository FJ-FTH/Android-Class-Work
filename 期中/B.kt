package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController


@Composable
fun Bpage(navController: NavHostController){
    Column {
        fun showStudentInfo(){
            for (student in students){
                println("学号：$${student.sid}," +
                        "姓名：$${student.sname}," +
                        "年龄：$${student.sage}," +
                        "邮件：$${student.semail}," +
                        "班级：$${student.sclass}")
            }
        }

        fun main(){
            showStudentInfo()
        }

        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }
}




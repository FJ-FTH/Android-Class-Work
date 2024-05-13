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
        Text(text = "学生信息")
        for (i in students.indices){
            Text(text = students[i].sclass)
            Text(text = students[i].semail)
            Text(text = students[i].sname)
            Text(text = students[i].sage)
        }
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }
}








//fun showStudentInfo(){
//            for (student in students){
//                println("学号：$${student.sid}," +
//                        "姓名：$${student.sname}," +
//                        "年龄：$${student.sage}," +
//                        "邮件：$${student.semail}," +
//                        "班级：$${student.sclass}")
//            }
//        }
//
//        fun main(){
//            showStudentInfo()
//        }




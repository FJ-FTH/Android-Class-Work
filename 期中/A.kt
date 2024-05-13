package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun Apage(navController: NavHostController){
    Column {
        Text(text = "教师信息")
        for (i in teachers.indices){
            Text(text = teachers[i].tclass)
            Text(text = teachers[i].temail)
            Text(text = teachers[i].tname)
            Text(text = teachers[i].tage)
        }
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }
}









//        fun showTeacherInfo(){
//            for (teacher in teachers){
//                println("工号：$${teacher.tid}," +
//                        "姓名：$${teacher.tname}," +
//                        "年龄：$${teacher.tage}," +
//                        "邮件：$${teacher.temail}," +
//                        "班级：$${teacher.tclass}")
//            }
//        }
//
//        fun main(){
//            showTeacherInfo()
//        }






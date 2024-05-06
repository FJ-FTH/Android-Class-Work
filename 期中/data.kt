package com.example.middleexam

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable

@Immutable
data class Teacher(
    var tid: Int,
    var tname:String,
    var tage:Int,
    var temail: String,
    var tclass: String
)
@Immutable
data class Student (
    var sid: Int,
    var sname:String,
    var sage:Int,
    var semail: String,
    var sclass: String

)
val teachers = listOf(
    Teacher(1,"张三",27,"1234567@qq.com","移动互联221班"),
    Teacher(1,"张三",27,"1234567@qq.com","移动互联221班"),
    Teacher(1,"张三",27,"1234567@qq.com","移动互联221班")
)
val students = listOf(
    Student(7,"王二",21,"09876576@qq.com","移动互联222班"),
    Student(7,"王二",21,"09876576@qq.com","移动互联222班"),
    Student(7,"王二",21,"09876576@qq.com","移动互联222班"),
    Student(7,"王二",21,"09876576@qq.com","移动互联222班"),
    Student(7,"王二",21,"09876576@qq.com","移动互联222班")
)
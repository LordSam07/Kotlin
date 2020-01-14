package com.lordSam.basics

fun main(){

    val msg = "welcome to kotlin"
    val name = "Sam"
    var say = "$msg,$name".also {
        println(it)
    }
}
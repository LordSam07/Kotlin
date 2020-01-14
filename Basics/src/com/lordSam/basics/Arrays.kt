package com.lordSam.basics

fun main(){
    var arr: Array<String> = Array(3){""}
    for (i in 0..2){
        arr[i] = readLine()!!.toString()
        println(arr[i])
    }
}
package com.lordSam.oop

fun main(){
    val pi by lazy {
        3.14 // to control memory,value will only be placed in memory if pi is used in the program
    }
}
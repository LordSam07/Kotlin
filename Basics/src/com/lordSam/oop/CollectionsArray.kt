package com.lordSam.oop

fun main(){
    var myArray = Array<Int>(5) { 0 }

    myArray[0] = 1
    myArray[4] = 5

    for (index in myArray) {
        print("$index ")
    }
}
package com.lordSam.oop

fun main() {

    val myNumbers = listOf<Int>(2, 3, 4, 6, 90, 80)

    val mySmallNumbers = myNumbers.filter { it < 10 } // or { v -> v < 10 } --boolean lambda

    for (num in mySmallNumbers) {
        println(num)
    }

    val mySquares = myNumbers.map { it * it }// or { v -> v * v } --transform lambda

    for (num in mySquares) {
        println(num)
    }

    val mySmallSquaredNumbers = myNumbers.filter { it < 10 }.map { it * it }

    for (num in mySmallSquaredNumbers) {
        println(num)
    }

    var people = listOf<PPerson>(PPerson(10, "Sam"), PPerson(20, "Alex"), PPerson(30, "Payal"))

    var names = people.filter { it.name.startsWith("S") }.map { it.name }
    for (name in names){
        println(name)
    }
}

class PPerson( var Age:  Int, var name: String){

}

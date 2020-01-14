package com.lordSam.oop

fun main(){

    val myNumbers = listOf<Int>(2,3,4,5,6,7,8,90,100)
    val myPredicate: (Int) -> Boolean = {num -> num > 10}
    val check1 = myNumbers.all (myPredicate)
    println(check1)

    val check2 = myNumbers.any(myPredicate)
    println(check2)

    val check3 = myNumbers.count(myPredicate)
    println(check3)

    val check4 = myNumbers.find ( myPredicate)
    println(check4)
}
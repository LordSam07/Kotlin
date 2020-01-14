package com.lordSam.oop

fun main(){

    var mySet = setOf<Int>(2,54,3,1,9,9,8)//Immutable

    for (key in mySet){
        println(key)
    }

    var myMSet = mutableSetOf<Int>(2,54,3,1,9,9,8)//mutable
    var myHSet = hashSetOf<Int>(2,54,3,1,9,9,8)//sequence not  promised

    myMSet.remove(8)
    myMSet.add(100)


}
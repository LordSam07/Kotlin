package com.lordSam.oop

fun main(){
    val itKeyword = ItKeyword()

    itKeyword.mirror("Hello") {it.reversed()}
}

class ItKeyword {
    fun mirror(str:String, myfuc: (String) -> String){
        println(myfuc(str))
    }
}
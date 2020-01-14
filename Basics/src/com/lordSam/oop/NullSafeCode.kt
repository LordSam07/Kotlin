package com.lordSam.oop

fun main(){

    //1-Safe Call ?
    var name: String? = null//Nullable(?) data type

    println(name?.length)

    name = "Sam"

    println(name.length)

    //2safe call with let

    name?.let {
        println(name.length)
    }

    //3 Elvis ?:
//    name = null

    val len = name?.length ?: -1
    print(len)

    //4 non - null assertion operator

   print(name!!.length)




}
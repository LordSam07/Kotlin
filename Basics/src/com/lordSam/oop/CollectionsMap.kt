package com.lordSam.oop

fun main(){

    var myMap= mapOf<Int, String>(2 to " sam", 1 to "payal", 5 to " alex")//immutable

    for (key in myMap.keys){
        println("${myMap[key]} , $key")//myMap.get(key)
    }


    var myHashMap = HashMap<Int, String>()//Mutable
    myHashMap[4] = "sam"
    myHashMap.put(3, "alex")
    myHashMap.put(2, "payal")
    myHashMap.replace(3, " SAM")//put()
}
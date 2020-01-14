package com.lordSam.basics

fun main(){

    var listOfUsers = HashMap<Int,String>()
    listOfUsers[12] = "sam"
    listOfUsers[1] = "alex"

    println(listOfUsers[1])

    for (key in listOfUsers.keys)
        println("$key,${listOfUsers[key]}")
}
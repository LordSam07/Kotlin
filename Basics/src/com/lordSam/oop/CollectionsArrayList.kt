package com.lordSam.oop

fun main(){

    var list = listOf<String>("Sam", "Payal")//Immutable
    var list2 = mutableListOf<String>("Sam", "Payal")
    //var list2 = arrayListOf<String>("Sam", "Payal")
    //var list3 = ArrayList<String>("Sam", "Payal")

    list2.add("Princess")
    list2[0] = "Alex"
}
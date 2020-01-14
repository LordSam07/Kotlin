package com.lordSam.basics

fun main(){

    var arrLst = ArrayList<String>()
    var max = 3


    for (i in 0 until max)
    {
        arrLst.add(readLine()!!.toString())
    }

    for (i in arrLst)
    {
        println(i)
    }

}
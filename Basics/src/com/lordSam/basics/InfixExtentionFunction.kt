package com.lordSam.basics

fun main()
{
    val x = 9
    val y = 7

    print(x.greater(y))
}


infix fun Int.greater(other:Int):Int{ // Extension + Infix function
    return if (this > other) {
        this
    } else
        other
}


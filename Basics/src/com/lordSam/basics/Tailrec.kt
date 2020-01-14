package com.lordSam.basics

import java.math.BigInteger

fun main(){
    println(fibo(100000, BigInteger("1"), BigInteger("0")))
}

tailrec fun fibo(n :Int, a: BigInteger, b: BigInteger):BigInteger{//tailrec manages overflow stack
    return if (n == 0)
        b
    else
        fibo(n-1, a + b, a)
}
package com.lordSam.oop

fun main(){

    val lambdas = Lambdas()

    val myLambda: ( Int, Int) -> Int = { x, y -> x + y }//Lambda expression
    lambdas.add(2,7, myLambda)
    //or
    //lambdas.add(2,7, { x, y -> x + y })
    //or
    //lambdas.add(2,7){ x, y -> x + y }
}

class Lambdas {

    fun add(a: Int, b: Int, action: (Int,Int) -> Int){//class is needed to create an object of lambda function
        print(action( a, b))
    }
}
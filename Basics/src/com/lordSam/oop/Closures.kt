package com.lordSam.oop

fun main(){
    var result = 0
    val lambdas = Lambdaz()

    val myLambda: ( Int, Int) -> Unit = { x, y -> result = x + y }//Lambda expression
    lambdas.add(2,7, myLambda)
    //or
    //lambdas.add(2,7, { x, y -> x + y })
    //or
    //lambdas.add(2,7){ x, y -> x + y }
    print(result)
}

class Lambdaz {

    fun add(a: Int, b: Int, action: (Int,Int) -> Unit){//class is needed to create an object of lambda function
        action( a, b)
    }
}
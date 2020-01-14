package com.lordSam.oop

//singleton attributes are static
fun main(){

    Singleton.count = 98
    println(Singleton.count)

    println(Singleton.typeOfCustomer())

    Singleton.myMethod("Hello")

}

open class MyClass {
    open fun myMethod(str: String){
        println("My super class")
    }
}


object Singleton: MyClass() {
    var count = -1

    fun typeOfCustomer():String{
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
    }

    init {
        //...
    }
}
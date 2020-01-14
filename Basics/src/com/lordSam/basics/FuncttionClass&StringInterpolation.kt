package com.lordSam.basics

fun main(){
    var name = "Sam"

    var p1 = Person()

    p1.display(name)
    p1.name = "Alex"
    p1.display(p1.name)

    var p2 = Person2()
    print(p2.name)
}

class Person {

    var name = ""
    fun display(name: String) {
        println("Name is $name")
    }
}
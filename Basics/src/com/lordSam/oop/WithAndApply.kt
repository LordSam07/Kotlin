package com.lordSam.oop

fun main(){

    var person = Person()

    with(person){
        name = "Sam"
        age = 23
    }

    person.apply{
        name = "Sam"
        age = 23
    }.startRun()

    println(person.name)
    println(person.age)

}

class Person{
    var name:String = ""
    var age = -1

    fun startRun(){
        print("now i am running")
    }
}
package com.lordSam.oop

fun main(){
    var student = Students("Alex", 10)
    println(student.id )
}


class Students(name : String) {//primary constructor

    var id: Int = -1

    init {
        println("My name is $name id: $id")
    }
    constructor(name : String, id :Int):this(name){//secondary constructor
        //this body is executed after the init block
        this.id = id
    }
}

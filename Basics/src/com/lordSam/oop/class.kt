package com.lordSam.oop

fun main(){
    var student = Student("Alex")

    student.name = "Alex"
        println("My name is ${student.name}")

}


class Student(_name : String) {//primary constructor

    var name : String = " Sam"
    init {
        this.name = _name
        println("My name is $_name")
    }
}
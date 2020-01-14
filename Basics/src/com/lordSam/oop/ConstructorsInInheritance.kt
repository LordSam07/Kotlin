package com.lordSam.oop

fun main(){
    var car = BMW("Black","Compact")
    car.color = "Black"
    car.type = "Sedan"
    Tata("Red","Sedan")
}

open class Car(var color: String){// primary constructor
    init {
        println("From Car: ${this.color}")
    }
}

class BMW(color: String, var type: String): Car(color){//default value ,type =" any" can be done too
    init {
        println("From BMW: $color & $type")
    }
}
class Tata: Car{//secondary constructor
    var type: String = ""
    constructor(color: String,type: String):super(color){
        this.type = type
        println("From Tata: $color & $type")
    }

}
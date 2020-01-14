package com.lordSam.oop

fun main(){
    var dog = Dogs()
    dog.eat()
    println(dog.color)

    var cat = Cats()
    cat.eat()

    var animal = Animals()
    animal.eat()
}

open class Animals{
    open var color: String = ""

    open fun eat(){
        println("Animal is eating.")
    }
}

class Dogs: Animals() {
    var breed: String = ""
    override var color: String = "Red"

    fun bark(){
        println("Bark!")
    }
    override fun eat(){
        super<Animals>.eat()
        println("Dog is eating.")
    }
}



class Cats: Animals() {
    var age: Int = -1

    fun meow(){
        println("Meow!")
    }
    override fun eat(){
        super.eat()
        println("Cat is eating.")
    }
}


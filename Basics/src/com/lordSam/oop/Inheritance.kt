package com.lordSam.oop

fun main(){
    var dog = Dog()
    dog.color = "Black"
    dog.bark()
    dog.eat()
    dog.breed = "Labra"
    print(dog)

    var cat = Cat()
    cat.color = "White"
    cat.eat()
    cat.age = 10
    print(cat)

}

open class Animal{
    var color: String = ""

    fun eat(){
        println("Eat")
    }
}

class Dog: Animal() {
    var breed: String = ""

    fun bark(){
        println("Bark!")
    }
}



class Cat: Animal() {
    var age: Int = -1

    fun meow(){
        println("Meow!")
    }
}
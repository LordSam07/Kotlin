package com.lordSam.oop

fun main(){
    val country = Country()
    country.name = "India"

    country.setup()
}

class Country {

    lateinit var name: String //to make late initialization possible

    fun setup(){
        print(name)
    }
}
package com.lordSam.oop

fun main(){
    println("Normal Class")
    var user1 = DataClass1("Sam",10)
    var user2 = DataClass1("Sam",10)

    println(user1)
    println(user2)

    if (user1 == user2)
    {
        println("Equal")
    }else{
        println("Not Equal")
    }

    println("Data Class")
    var user3 = DataClass2("Sam",10)
    var user4 = DataClass2("Sam",10)

    println(user3)
    println(user4)

    if (user3 == user4)
    {
        println("Equal")
    }else{
        println("Not Equal")
    }

    var newUser1 = user3.hashCode()
    println("NewUser: $newUser1")

    var newUser2 = user3.copy(id = 20, name = "Alex")
    println("NewUser: $newUser2")

    var newUser3 = user3.copy()
    println("NewUser: $newUser3")

    var newUser4 = user3.copy(id = 30)
    println("NewUser: $newUser4")

}


class DataClass1(var name: String, var id: Int) {

}
data class DataClass2(var name: String, var id: Int) {

}
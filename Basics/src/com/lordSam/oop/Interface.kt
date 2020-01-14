package com.lordSam.oop

fun main(){
    var inf = MyButton()

    inf.onClick()
    inf.onTouch()

}

interface MyInterfaceListener {

    var name: String // abstract by default

    fun onTouch() //abstract by default

    fun onClick(){//normal function
        println("Interface function called")
    }
}

interface MySecondInterfaceListener {

    fun onTouch(){
        println("MySecondInterfaceListener: onClick")
    }

    fun onClick(){//normal function
        println("MySecondInterfaceListener: onTouch")
    }
}

class MyButton: MyInterfaceListener, MySecondInterfaceListener {
    override var name: String = ""

    override fun onTouch() {
        println("Button was touched")
    }

    override fun onClick() {//not compulsory to override
        super<MyInterfaceListener>.onClick()
        super<MySecondInterfaceListener>.onClick()
        println("Button was clicked")
    }

}
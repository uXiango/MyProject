package com.tom.kotlin

fun main() {
//    println("Hello World!")
    val h = Human()
    h.hello()
}

class Human {
    fun hello() { //不回傳資料時，不用寫void
        println("Hello World!")
    }
}
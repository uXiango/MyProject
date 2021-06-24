package com.tom.kotlin

fun main() {
//    println("Hello World!")
    val h = Human()
    h.hello()
    val age : Int = 19; //val 表示固定不可改變
    var age2 = 20; // var可以被改變
    age2 = 21;
}

class Human {
    fun hello() { //不回傳資料時，不用寫void
        println("Hello World!")
    }
}
package com.tom.kotlin

fun main() {
//    println("Hello World!")

    var s : String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))

    val h = Human(weight = 45f,height = 1.6f)
    println(h.bmi())
/*    val age : Int = 19; //val 表示固定不可改變
    var age2 = 20; // var可以被改變
    age2 = 21;*/

//    val n = Human("JB",weight = 50f,height = 1.7f)
}

class Human(var weight: Float, var height: Float, var name: String = ""){ //變數可給預設值

    init {
        println("test weight = $weight") //加了"$"可直接使用變數
    }

    constructor(name: String, weight: Float, height: Float) : this(weight, height, name) {
        //這是次要建構子
        //建構子中不可用var、val定義變數
        println("secondary constructor = $name" )
    }

    fun bmi() : Float{
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello() { //不回傳資料時，不用寫void
        println("Hello World!")
    }
}
package com.tom.kotlin

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val serect = Random().nextInt(10)+1
    println(serect)

    for(i in 1..4) {
        println("Please enter a number($i/4): ")
        var number = scanner.nextInt()
        println("第 $i 次 $number")

        if(number > serect) {
            println("Lower!")
        }else if (number < serect) {
            println("Higher!")
        }else {
            println("Great! The number is $number")
            break
        }
    }
}
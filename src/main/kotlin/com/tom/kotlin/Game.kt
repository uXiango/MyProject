package com.tom.kotlin

import java.util.*

fun main() {
//    val scanner = Scanner(System.`in`)
    val serect = Random().nextInt(10)+1
    println(serect)
    var number = 0
    while (number != serect) {
        println("Please enter a number: ")
//        number = scanner.nextInt();
        number = readLine()!!.toInt()
        if (number > serect) {
            println("Lower")
        } else if (number < serect){
            println("Higher")
        } else {
            println("Great! The number is $number")
        }
    }
}
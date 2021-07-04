package com.tom.kotlin

fun main() {
    val list = listOf(5,2,3,6);
    println(list)

    val scores = listOf(66,53,92,100);
    for (score in scores) {
        println(score)
    }

    var mutableList = mutableListOf(5,2,3,6)

    mutableList.add(7)
    println(mutableList)

    for (n in mutableList) {
        println(n)
    }

    val array = arrayListOf(1,2,3)
    print(array);


}
package com.tom.kotlin.student

import java.util.*

fun main() {
//    userInput()
    student.pass = 50
    val stu = student("xiang",70,100)
    val stu2 = student("kaint",44,68)
    val stu3 = student("reann",60,20)
    val gstu = GraduateStudent("peace",55,65,60)
    gstu.print()
    stu.print()
    stu2.print()
    stu3.print()

    var test = 123
    println("this is : $test")
    println("highest score: ${stu.highest()}")

}

class GraduateStudent (name: String?,english: Int,math: Int,var thesis: Int): student(name, english, math) {
    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed(): String = if (getAverage()>= pass) "!PASS!" else "!FAIELD!"

}

// 要加上opent 才可以繼承此方法
open class student(var name:String?, var english:Int, var math:Int){
    companion object {
        @JvmStatic
        var pass = 60;
        fun test() {
            println("testing")
        }
    }

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun getAverage() = (english+math)/2

    //要加上open，才可覆寫此方法
    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when (getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    //因graduateStudent中，pass判斷分數不同，因此也要覆寫
    open fun passOrFailed() = if (getAverage()>= pass) "!PASS!" else "!FAIELD!"

    fun nameCheck() = println(name?.length)
}

private fun userInput() {
    val scanner = Scanner(System.`in`) //in在Kotlin為關鍵字，需要``辨別
    print("Please enter student's name : ")
    var name = scanner.next()
    print("Please enter student's english : ")
    var english = scanner.nextInt()
    print("Please enter student's math : ")
    var math = scanner.nextInt()
    var stu = student(name, english, math)
    stu.print()
    stu.nameCheck()
}


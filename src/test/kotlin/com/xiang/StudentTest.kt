package com.xiang.kotlin

import com.tom.kotlin.student.student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun highestTest() {
        val student = student("xiang",80,100)
        Assertions.assertEquals(100,student.highest())
    }

    @Test
    fun averageTest() {
        val student = student("xiang",80,100)
        Assertions.assertEquals((80+100)/2,student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = student("xiang",80,100)
        Assertions.assertEquals('A',student.grading())
    }
}
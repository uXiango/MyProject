package com.xiang.kotlin

import com.tom.Person
import com.tom.kotlin.Human
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun humanBmiTest() {
        val human = Human("xiang",50f,1.7f)
        Assertions.assertEquals(50f/(1.7f*1.7f),human.bmi())
    }


    fun personBmiTest() {
        val person = Person(66f,1.7f)
        Assertions.assertEquals(66f/(1.7f*1.7f),person.bmi())
    }

}
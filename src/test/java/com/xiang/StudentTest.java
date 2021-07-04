package com.xiang;

import com.tom.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void highestTest() {
        Student student = new Student("xiang",70,100);
        Assertions.assertEquals(100,student.highest());
    }
    @Test
    public void averageTest() {
        Student student = new Student("xiang",80,90);
        Assertions.assertEquals((80+90)/2,student.getAverage());
    }
}

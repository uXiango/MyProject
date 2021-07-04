package com.tom.student;

import com.tom.kotlin.student.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 50;
        Student stu = new Student("Tom",10,98);
        Student stu2 = new Student("Ann",60,40);
        Student stu3 = new Student("Oil",30,50);
        GraduateStudent gstu = new GraduateStudent("Ten",60,50,70);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();

        student.getPass();
//        System.out.println("highest score = " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter student's name :");
        String name = scanner.next();
        System.out.println("Pleas enter student's english :");
        int english = scanner.nextInt();
        System.out.println("Pleas enter student's math :");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("highest score = " + stu.highest());
    }
}

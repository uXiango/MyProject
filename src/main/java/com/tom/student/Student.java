package com.tom.student;

public class Student {
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
        int max = (english>math) ? english : math ;
        /*int max = 0 ;
        if (english>math) {
            max = english;
        }
        else {
            max = math;
        }*/
        return max;
    }

    public void print() {

        int average = getAverage();
        System.out.print(name + "\t" +
                           english + "\t" +
                           math + "\t" +
                           getAverage() + "\t" +
                           ((average>=pass ) ? "PASS" : "FAILED"));

        char grading = 'F';

        switch (average/10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }

/*        if (average >= 90 && average <=100){
            grading = 'A';
        } else if (average >=80 && average <= 89){
            grading = 'B';
        } else if (average >=70 && average <= 79){
            grading = 'C';
        } else if (average >=60 && average <=69){
            grading = 'D';
        }*/
        System.out.println("\t"+grading);
 /*       if (getAverage() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }*/
    }

    public int getAverage() {
        return (english+math)/2;
    }
}

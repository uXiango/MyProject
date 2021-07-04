package com.tom;

public class Person {

    String name;
    float weight;
    float height;

    //建構子
    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    //多個建構子 overloading
    public Person(String name, float weight, float height){
        this(weight, height); //因上面的建構子已宣告,可縮寫且一定要放在第一行
        this.name = name;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
//        System.out.println("Hello World!");

    }
}

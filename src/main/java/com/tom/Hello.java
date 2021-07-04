package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        String s = "abcde";
        System.out.println(s.charAt(3)); //index=3的字
        System.out.println(s.length());  //總長度
        System.out.println(s.substring(3));  //取子字串從index=3開始取到最後
        System.out.println(s.substring(1,4));  //取子字串從index=1開始取到index=4

        Person p = new Person("A",45f,1.6f);
        p.hello();
       /* p.weight = 45f;
        p.height = 1.6f;*/
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        System.out.println(age2.equals(19));
        char a = 'A';
        float f = 19.7f;
        byte b = 120;
        boolean adult = true;
        String name = "Apple";*/


    }
}

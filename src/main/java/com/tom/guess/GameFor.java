package com.tom.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {

    public static void main(String[] args) {

/*        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);*/

        int serect = new Random().nextInt(10)+1;
        System.out.println(serect);
        for (int i=1; i<=4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number("+i+"/4) :");
            int number = scanner.nextInt();
            System.out.println("第"+i+"次: "+ number);
            if (number > serect) {
                System.out.println("Lower!");
            } else if (number < serect) {
                System.out.println("Higher!");
            } else {
                System.out.println("Great! The number is "+ number);
                break;
            }
        }

//        System.out.println("FAILED! The number is "+ serect);
    }

}

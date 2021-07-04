package com.tom.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        set();
        HashMap<String,String> stocks = new HashMap();
        stocks.put("2330","台積電");
        stocks.put("2317","鴻海");
        stocks.put("2330","tsmc");
        System.out.println(stocks.get("2317"));
        System.out.println(stocks);

        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }

    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(1);
        System.out.println(set);

        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(1);
        System.out.println(n1+" "+n2);

        List<Integer> scores = Arrays.asList(60,80,90,100,68);
        for (int score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers  = new int[5];
        numbers[0] = 3;
        int[] scores = {68,96,32,36,19};
        for (int i=0;i<5;i++) {
            System.out.println(scores[i]);
        }

        //陣列值放入n
        for (int n : scores) {
            System.out.println(n);
        }
    }
}

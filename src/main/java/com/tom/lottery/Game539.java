package com.tom.lottery;

import java.util.Collection;
import java.util.Random;
import java.util.Set;

public class Game539 extends NumberGame{
    @Override
    public void generate() {
        int n ;
        numbercount = 3;
        Random random = new Random(numbercount);
        while (numbers.size()<numbercount) {
            numbers = genNum();
        }
        boolean size = validate();
        if (size) {
            System.out.println("game539 number is = " + numbers);
        } else {
            System.out.println("game539's size wrong!");
        }
    }

    @Override
    public Set<Integer> genNum() {
        int n = new Random().nextInt(10);
        numbers.add(n);
        return numbers;
    }


}

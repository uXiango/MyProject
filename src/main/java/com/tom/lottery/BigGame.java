package com.tom.lottery;

import java.util.Collection;
import java.util.Random;
import java.util.Set;

public class BigGame extends NumberGame{

    @Override
    public void generate() {
        int n ;
        numbercount = 5;
        Random random = new Random(numbercount);
        while (numbers.size()<numbercount) {
            numbers = genNum();
        }
        boolean size = validate();
        if (size) {
            System.out.println("biggmae number is = " + numbers);
        } else {
            System.out.println("biggame's size wrong!");
        }
    }

    @Override
    public Set<Integer> genNum() {
        int n = new Random().nextInt(49);
        numbers.add(n);
        return numbers;
    }

}

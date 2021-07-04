package com.tom.lottery;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numbercount = 0;
    //繼承NumberGame方法的一定要實作generate方法，也要加上abstract class
    public abstract void generate();
    //取得亂數號碼
    public abstract Set<Integer> genNum();
    //檢查產生的號碼個數是否符合
    public boolean validate() {
        if (numbers.size()==numbercount) {
            return true;
        } else
            return false;
    }
}

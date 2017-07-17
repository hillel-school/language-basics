package com.hillel.language.basis5;

import java.util.Arrays;

public class MethodOverload {

//    int countProfit(long a) { // type widening
//        return (int)(a * 2);
//    }

    int countProfit(Integer a) { // autoboxing
        return a * 3;
    }

    int countProfit(int... a) { // varargs
        return a[0] * 4;
    }

    void method(String st1, String... st2) {
        System.out.println(Arrays.toString(st2));
    }

    public static void main(String[] args) {
        MethodOverload methodOverload = new MethodOverload();
        int profit = methodOverload.countProfit(1);
        //System.out.println(profit);
//        methodOverload.method("a", "b", "c");
    }
}

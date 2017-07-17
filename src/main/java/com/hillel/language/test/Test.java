package com.hillel.language.test;

public class Test {

    public static void main(String[] args) {
        int number = 3;

        System.out.println("lol");

        long startRecursion = System.nanoTime();
        System.out.println(tribonacciRecursion(number));
        long finishRecursion = System.nanoTime();
        System.out.println("tribonacciRecursion time = " + (finishRecursion - startRecursion));

        long startCycle = System.nanoTime();
        System.out.println(tribonacciCycle(number));
        long finishCycle = System.nanoTime();
        System.out.println("tribonacciCycle time = " + (finishCycle - startCycle));

    }

    static long tribonacciRecursion(int number) {
        System.out.println("rec called");
        if (number <= 3) {
            return number;
        } else {
            return tribonacciRecursion(number - 1) + tribonacciRecursion(number - 2) + tribonacciRecursion(number - 3);
        }
    }
    static long tribonacciCycle(int number) {
        System.out.println("cycle called");
        long a = 1L, b = 2L, c = 3L;
        if (number <= 3) {
            return number;
        } else {
            while (number != 1) {
                c += a + b;
                b = c - a - b;
                a = c - b - a;
                number--;
            }
            return a;
        }
    }
}

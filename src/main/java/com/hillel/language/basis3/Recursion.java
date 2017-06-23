package com.hillel.language.basis3;

public class Recursion {

    public static void main(String[] args) {
        int sum = sum(5, 10);
        System.out.println(sum);
    }

    static int sum(int first, int second) {
        if (second > 0) {
            return sum(++first, --second);
        }
        else {
            return first;
        }
    }
}

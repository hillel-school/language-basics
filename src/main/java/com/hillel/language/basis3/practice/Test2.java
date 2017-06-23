package com.hillel.language.basis3.practice;

public class Test2 {

    public static void main(String[] args) {
        int n = 4;

        while (n > 1) {
            if (n == 2) {
                System.out.println("yes");
                break;
            }
            n = n / 2;
        }
    }
}

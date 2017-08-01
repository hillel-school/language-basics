package com.hillel.language.basis10;

public class ErrorExample {

    public static void main(String[] args) {
        int i = 0;

        recursiveMethod(i);
    }

    static int recursiveMethod(int i) {
        return recursiveMethod(i + 1);
    }
}

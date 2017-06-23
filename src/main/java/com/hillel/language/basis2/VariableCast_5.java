package com.hillel.language.basis2;

/**
 * Created by alexstybaev on 6/18/17.
 */
public class VariableCast_5 {

    public static void main(String[] args) {
        double x = 10.0;
        double y = 3;

        // needs casting
        int i = (int) (x/y);
        System.out.println(i);

        // no need to cast
        float f = i;

        interesting();
    }

    private static void interesting() {
        int big = 1234567890;
        float approx = big;
        System.out.println(approx);
        System.out.println("Woah! " + (big - (int)approx));
    }
}

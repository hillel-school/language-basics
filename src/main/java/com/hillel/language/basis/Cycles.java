package com.hillel.language.basis;

/**
 * Created by alexstybaev on 6/15/17.
 */
public class Cycles {

    public static void main(String[] args) {

        for(int i = 2; i < 10; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("Fahren");
        }

//        int r = 0;
//        while(r < 10) {
//            System.out.println("*");
//            r += 1;
//        }
    }
}

package com.hillel.language.basis2;

/**
 * Created by alexstybaev on 6/18/17.
 */
public class IfOperator_1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 2;

        int d = 101;
        char e = 'e';

        if(a < b) {
            System.out.println("You will see this");
        }

        if(a > c) {
            System.out.println("You won't see this");
        }
        else {
            System.out.println("You will see else");
        }

        if (c == b) {
            System.out.println("You will definitely see this!");
        }

//        if (d == e) {
//            System.out.println("Guess what will be here!");
//        }
    }
}

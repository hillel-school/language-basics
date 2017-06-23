package com.hillel.language.basis2;

/**
 * Created by alexstybaev on 6/18/17.
 */
public class SwitchOperator_6 {

    public static void main(String[] args) {

        int a = 1;
        int i = a + 0;

        switch (i) {
            case 1: {
                System.out.println(i);
            }
            case 2: {
                System.out.println(i + 2);
            }
            default: {
                System.out.println(i + 5);
            }
        }
    }
}

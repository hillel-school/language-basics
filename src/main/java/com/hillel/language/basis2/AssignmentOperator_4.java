package com.hillel.language.basis2;

/**
 * Created by alexstybaev on 6/18/17.
 */
public class AssignmentOperator_4 {

    public static void main(String[] args) {
        int a = 1;

        a += 2;
        System.out.println(a);

        a *= 7;
        System.out.println(a);

        a -= 3;
        System.out.println(a);

        a /= 3;
        System.out.println(a);

        a %= 4;
        System.out.println(a);

        a ^= 5;
        System.out.println(a);

        a |= 3;
        System.out.println(a);

        a &= 4;
        System.out.println(a);

        a >>= 1;
        System.out.println(a);

        a <<= 1;
        System.out.println(a);

        int b = -4;

        b >>>= 1;
        System.out.println(b);

        int a1 = (int)(char)(byte) 200;
    }
}

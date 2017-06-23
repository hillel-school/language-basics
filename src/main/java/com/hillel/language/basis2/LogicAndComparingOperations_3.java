package com.hillel.language.basis2;

/**
 * Created by alexstybaev on 6/18/17.
 */
public class LogicAndComparingOperations_3 {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = a + b; // 4
        // equal
        System.out.println(a == c);

        // less then
        System.out.println(a < b);

        // more then
        System.out.println(c > b);

        // more then or equal
        System.out.println(c >= a + b);

        // more then or equal
        System.out.println(c <= a + b);

        // not equal
        System.out.println(a != c);

        /* bitwise */

        // bitwise or
        System.out.println(a|b); // 001 | 011 = 011

        // bitwise and
        System.out.println(a&c); // 001 & 100 = 000

        // xor
        System.out.println(a^b); // 001 ^ 011 = 010

        // bit shift left
        System.out.println(a << 3); // 0001 -> 1000

        // bit shift right
        System.out.println(b >> 1); // 0011 -> 0001

        // unsigned bit shift right
        System.out.println(b >>> 1);

        /* logic */

        boolean f = true;
        boolean g = false;
        boolean h = false;

        // or
        System.out.println(f || g);

        // and
        System.out.println(g && h);

        // not
        System.out.println(!h);
    }
}

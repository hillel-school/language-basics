package com.hillel.language.basis.practice;

import java.util.Scanner;

/**
 * Class that helps in converting Fahrenheit degrees to Celsius
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(toCelsius(i));
    }

    private static int toCelsius(int i) {
        return (i - 32) * 5 / 9;
    }
}

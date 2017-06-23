package com.hillel.language.basis3.practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Type number");

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (isDivisionByTwo(i)){
                System.out.println("Number division by two without reminder");
                break;
            }
        }
    }

    public static boolean isDivisionByTwo(int i){
        return i % 2 == 0;

    }
}

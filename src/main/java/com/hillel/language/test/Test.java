package com.hillel.language.test;

import java.util.Scanner;

/**
 * Created by alexstybaev on 6/19/17.
 */
public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во градусов Цельсия(Для выхода введите q):");
        String input=scan.nextLine();
        while (!input.equals("q")){
            int Celsius=Integer.parseInt(input);
            int C2F=Celsius*9/5+32;

//            System.out.print("%d градусов Цельсия равны %d градусам Фаренгейта \n", Celsius,C2F);

            System.out.println(Celsius + "  градусов Цельсия равны  " + C2F + "  градусам по Фаренгейту  ");
            System.out.println("Введите кол-во градусов Цельсия(Для выхода введите q):");
            input=scan.nextLine();
        }
    }
}

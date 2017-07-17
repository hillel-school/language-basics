package com.hillel.language.basis5;

public class Autoboxing {

    public static void main(String[] args) {
        Integer i = Integer.valueOf(1);

        //int a = i * 3;
        int a = i.intValue() * 3;


        Byte b = 3;
        b = null;

//        System.out.println(b > 1);


        int[] arr = {1, 2, 3};


        for (Integer count : arr) {
            System.out.println(count - 1);
        }
    }
}

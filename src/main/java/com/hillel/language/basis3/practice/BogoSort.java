package com.hillel.language.basis3.practice;

import java.util.Arrays;
import java.util.Random;

public class BogoSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2, 7, 8, 1, 4, 10, 3, 6, 8};
        long start = System.currentTimeMillis();
        while (!correct(arr)) {
            shuffle(arr);
        }
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("time taken - " + (end - start) + "ms");
    }

    private static boolean correct(int[] arr) {
        int size = arr.length;
        while (--size > 0)
            if (arr[size - 1] > arr[size])
                return false;
        return true;
    }

    private static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            swap(arr, i, (random.nextInt(100) % arr.length));
    }

    private static void swap(int[] arr, int i, int i1) {
        if(i != i1) {
            arr[i] = arr[i] ^ arr[i1];
            arr[i1] = arr[i] ^ arr[i1];
            arr[i] = arr[i] ^ arr[i1];
        }
    }
}

package com.hillel.language.basis3;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] i = {1, 3, 5, 2, 9, 4, 2, 3, 11, -2};
        String s = Arrays.toString(bubbleSort(i));
        System.out.println(s);
    }

    private static int[] bubbleSort(int[] original) {
        int[] result = Arrays.copyOf(original, original.length);

        for(int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length; j++) {
                if (result[i] > result[j]) {
                    result[i] = result[i] ^ result[j];
                    result[j] = result[i] ^ result[j];
                    result[i] = result[i] ^ result[j];
                }
            }
        }
        return result;
    }
}

package com.hillel.language.basis3;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] i = {1, 3, 5, 2, 9, 4, 2, 3, 11, -2};
        doSort(i, 0, i.length - 1);
        System.out.println(Arrays.toString(i));
    }

    private static void doSort(int[] array, int start, int end) {
        int piv = array[start + (end - start) / 2];
        int left = start;
        int right = end;

        while (left <= right)
        {
            while (array[left] < piv) {
                left++;
            }
            while (array[right] > piv) {
                right--;
            }
            if (left <= right) {
                swap (array, left, right);
                left++; right--;
            }

        }
        if (start < right)
            doSort (array, start, right);
        if (end > left)
            doSort (array, left, end);
    }

    private static int[] swap(int[] arr, int first, int second) {
        if (first == second) {
            return arr;
        }
        arr[first] = arr[first] ^ arr[second];
        arr[second] = arr[first] ^ arr[second];
        arr[first] = arr[first] ^ arr[second];
        return arr;
    }
}

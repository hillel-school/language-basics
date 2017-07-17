package com.hillel.language.basis5.practice;

import java.util.Arrays;

/**
 * Created by alexstybaev on 6/29/17.
 */
public class ComparableExample {

    public static void main(String[] args) {
        Test1[] arr = new Test1[2];

        Arrays.parallelSort(arr);
    }


    private class Test1 implements Comparable<Test1>{

        int i;

        @Override
        public int compareTo(Test1 other) {
            return this.i - other.i;
        }
    }
}

package com.hillel.language.basis2;

import java.util.Arrays;

/**
 * Created by alexstybaev on 6/18/17.
 */
public class BreakOperator_7 {

    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = 3;
            }
        }

        arr[5][7] = 1;
        arr[5][8] = 2;

        int i;
        int j = 0;
        sonic: for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (arr[i][j] == 1) {
                    break; // continue sonic;
                }
                //
                if (arr[i][j] == 2) {
                    break sonic;
                }
            }
        }

        System.out.println(i + ", " + j);
    }
}

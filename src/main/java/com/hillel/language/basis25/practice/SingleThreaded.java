package com.hillel.language.basis25.practice;

public class SingleThreaded {

    public int[][] calculate(int[][] one, int[][] two) {
        int[][] resultMatrix = new int[one.length][two[0].length];

        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < two[0].length; j++) {

                int result = 0;
                for (int k = 0; k < one[0].length; k++) {
                    result += one[i][k] * two[k][j];
                }
                resultMatrix[i][j] = result;
            }
        }

        return resultMatrix;
    }
}

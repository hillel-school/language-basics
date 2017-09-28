package com.hillel.language.basis25.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MultiThreadedCallable implements Callable<List<Integer>>{

    // 1x5 - 5x3
    private int[] row;
    private int[][] matrix;

    public MultiThreadedCallable(int[] row, int[][] matrix) {
        this.row = row;
        this.matrix = matrix;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> results = new ArrayList<>();
        for (int j = 0; j < matrix[0].length; j++) {
            int result = 0;
            for (int i = 0; i < matrix.length; i++) {
                result += row[i]*matrix[i][j];
            }
            results.add(result);
        }
        return results;
    }
}

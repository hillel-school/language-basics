package com.hillel.language.basis25.practice;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        int[][] one = createMatrix(1600, 800);
        int[][] two = createMatrix(800, 1500);

        MultiThreaded multiThreaded = new MultiThreaded();
        SingleThreaded singleThreaded = new SingleThreaded();

        long start = System.currentTimeMillis();
        int[][] result = multiThreaded.calculate(one, two);
        long end = System.currentTimeMillis();
        System.out.println("Multithreaded Time: " + (end - start));

        start = System.currentTimeMillis();
        result = singleThreaded.calculate(one, two);
        end = System.currentTimeMillis();
        System.out.println("Singlethreaded Time: " + (end - start));

    }

    private static int[][] createMatrix(int x, int y) {
        int [][] matrix = new int[x][y];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                //matrix[i][j] = random.nextInt(20);
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}

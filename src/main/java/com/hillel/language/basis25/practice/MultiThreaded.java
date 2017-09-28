package com.hillel.language.basis25.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreaded {

    public int[][] calculate(int[][] one, int[][] two) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(50);
        List<Future<List<Integer>>> futures = new ArrayList<>();
        for (int[] anOne : one) {
            Future<List<Integer>> future = service.submit(new MultiThreadedCallable(anOne, two));
            futures.add(future);
        }

        int[][] result = new int[one.length][two[0].length];
        for (int i = 0; i < futures.size(); i++) {
            List<Integer> res = futures.get(i).get();
            for (int j = 0; j < res.size(); j++) {
                result[i][j] = res.get(j);
            }

        }

        service.shutdown();
        return result;
    }
}

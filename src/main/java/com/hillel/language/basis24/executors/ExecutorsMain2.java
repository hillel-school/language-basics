package com.hillel.language.basis24.executors;

import com.hillel.language.basis24.callables.MyCallable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.google.common.collect.Lists.newArrayList;

public class ExecutorsMain2 {

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            List<Integer> numbers = generateNumbers(i*10, i*100000);
            Collections.shuffle(numbers);
            tasks.add(new MyCallable(numbers));
        }

        List<Future<Integer>> results = service.invokeAll(tasks);

        boolean finished = false;

        while (!finished) {
            finished = true;
            for (Future result : results) {
                if(!result.isDone()) {
                    finished = false;
                }
            }
            System.out.println("Waiting...");
            Thread.sleep(100);
        }

        for (Future result : results) {
            System.out.print(result.get() + ", ");
        }
        System.out.println("");
        System.out.println("Finished");
        service.shutdown();
    }

    private static List<Integer> generateNumbers(int start, int end) {
        return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
}

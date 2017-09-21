package com.hillel.language.basis24.callables;

import java.util.List;
import java.util.concurrent.FutureTask;

import static com.google.common.collect.Lists.newArrayList;

public class CallableMain {

    public static void main(String[] args) throws Exception {
        List<Integer> numbers = newArrayList(1,3,4,9,3,1,3,5,0,8,7,6,5,3,2,231,2312,321,312,312,31,23,1,54,6,57,56,86,
                78,678,76,8,-100);

        MyCallable myCallable = new MyCallable(numbers);
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);

        Thread thread = new Thread(futureTask);

        thread.start();
        System.out.println("Start waiting");
        while (!futureTask.isDone()) {
            System.out.println("Waiting...");
            Thread.sleep(300);
        }
        int result = futureTask.get();
        System.out.println(result);
    }
}

package com.hillel.language.basis24.callables;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;

public class MyCallable implements Callable<Integer> {

    List<Integer> list;

    public MyCallable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        //Thread.sleep(1000);
        list.sort(Comparator.naturalOrder());
        System.out.println("Thread: " + Thread.currentThread().getName());
        return list.get(0);
    }
}

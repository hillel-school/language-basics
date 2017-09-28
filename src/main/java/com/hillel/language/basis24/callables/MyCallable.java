package com.hillel.language.basis24.callables;

import java.util.Collections;
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
        //Thread.sleep(2000);
        System.out.println("Thread: " + Thread.currentThread().getName());
        return Collections.min(this.list);
    }
}

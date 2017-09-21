package com.hillel.language.basis23.collections;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;

public class MyConcurrentRunnable implements Runnable {

    ConcurrentMap<String, Integer> holder;
    String source;

    public MyConcurrentRunnable(ConcurrentMap<String, Integer> holder, String source) {
        this.holder = holder;
        this.source = source;
    }

    @Override
    public void run() {
        String[] strings = source.split(" ");
        for (String s : strings) {
            String lower = s.toLowerCase();
            this.holder.compute(lower, new MyFunction());
        }
    }

    private static class MyFunction implements BiFunction<String, Integer, Integer> {

        @Override
        public Integer apply(String s, Integer integer) {
            if (integer == null) {
                return 1;
            } else {
                return ++integer;
            }
        }
    }
}


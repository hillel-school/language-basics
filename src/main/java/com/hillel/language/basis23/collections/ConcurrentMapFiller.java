package com.hillel.language.basis23.collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcurrentMapFiller {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentMap<String, Integer> strings = new ConcurrentHashMap<>();

        String sentence1 = "In computer programming, particularly in the C, C++, C#, and Java programming languages, " +
                "the volatile keyword indicates that a value may change between different accesses, even if it does not " +
                "appear to be modified.";

        String sentence2 = "In computer science, mutual exclusion is a property of concurrency control, which is instituted " +
                "for the purpose of preventing race conditions; it is the requirement that one thread of execution never " +
                "enter its critical section at the same time that another concurrent thread of execution enters its own " +
                "critical section.";

        new Thread(new MyRunnable(strings, sentence1)).start();
        new Thread(new MyRunnable(strings, sentence2)).start();

        Thread.sleep(1000);
        System.out.println(strings.size());
    }

    private static class MyRunnable implements Runnable {

        ConcurrentMap<String, Integer> holder;
        String source;

        public MyRunnable(ConcurrentMap<String, Integer> holder, String source) {
            this.holder = holder;
            this.source = source;
        }

        @Override
        public void run() {
            String[] strings = source.split(" ");
            for(String s : strings) {
                String lower = s.toLowerCase();
                this.holder.compute(lower, (key, value) -> {
                    if (value == null) {
                        return 1;
                    } else {
                        return value++;
                    }
                });
            }
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

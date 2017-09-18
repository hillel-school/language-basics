package com.hillel.language.basis23.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MapFiller {

    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> strings = new HashMap<>();

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

        Map<String, Integer> holder;
        String source;

        public MyRunnable(Map<String, Integer> holder, String source) {
            this.holder = holder;
            this.source = source;
        }

        @Override
        public void run() {
            String[] strings = source.split(" ");
            for(String s : strings) {
                String lower = s.toLowerCase();
                if(this.holder.containsKey(lower)) {
                    int count = this.holder.get(lower);
                    this.holder.put(s, ++count);
                }
                else {
                    this.holder.put(lower, 1);
                }
            }
        }
    }
}

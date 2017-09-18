package com.hillel.language.basis23.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MapFiller {

    public static void main(String[] args) throws InterruptedException {
        Set<String> strings = new HashSet<>();

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

        Set<String> holder;
        String source;

        public MyRunnable(Set<String> holder, String source) {
            this.holder = holder;
            this.source = source;
        }

        @Override
        public void run() {
            Collections.addAll(holder, source.split(" "));
        }
    }
}

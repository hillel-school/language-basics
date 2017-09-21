package com.hillel.language.basis23.collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

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

        Thread one = new Thread(new MyConcurrentRunnable(strings, sentence1));
        one.start();
        Thread two = new Thread(new MyConcurrentRunnable(strings, sentence2));
        two.start();

        one.join();
        two.join();

        System.out.println(strings.size());
    }
}

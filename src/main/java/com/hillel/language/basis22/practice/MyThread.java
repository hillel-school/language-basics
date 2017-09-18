package com.hillel.language.basis22.practice;

import java.util.Arrays;
import java.util.Set;

public class MyThread extends Thread {
    String s;
    Set<String> set;

    public  MyThread(String s, Set<String> set) {
        this.s = s;
        this.set = set;
    }

    @Override
    public void run() {
        String[] arr = s.split(" ");
        set.addAll(Arrays.asList(arr));
    }
}

package com.hillel.language.basis10.factory_method;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExamples {

    public static void main(String[] args) {
        List<Integer> list = ImmutableList.of(1, 2, 3);

        String s = String.valueOf(true);
        System.out.println(s);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
    }
}

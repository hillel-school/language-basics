package com.hillel.language.basis9;

import com.google.common.collect.Lists;

import java.util.List;

public class Sublists {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);

        //List<Integer> result = list.subList(3, 6);

        list.subList(1, 3).clear();

        System.out.println(list);
    }
}

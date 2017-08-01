package com.hillel.language.basis10.practice;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfTwo {

    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1, 1, 2, 3, 4, 5, 6, 10);
        findPairs(list, 11);
    }

    static void findPairs(List<Integer> list, int sum) {

        Set<Integer> additions = new HashSet<>(list.size());
        for (int i : list) {
            additions.add(sum - i);
        }

        for (int i : list) {
            if (additions.contains(i)) {
                additions.remove(sum - i);
                additions.remove(i);
                System.out.println(String.format("pair found: [%s, %s]", i, sum - i));
            }
        }
    }
}

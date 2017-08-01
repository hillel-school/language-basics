package com.hillel.language.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void findPair(List<Integer> list, int sum) {
        List<Integer> mass = new ArrayList<>();
        Collections.sort(list);

        int first = 0;
        int last = list.size() - 1;

        while (list.get(first) < list.get(last)) {
            int s = list.get(first) + list.get(last);
            if (s == sum) {
                System.out.println(list.get(first) + " " + list.get(last));
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
        //System.out.println(first + " " + last);
    }


    public static void main(String[] args) {
        int number = 9;
        List<Integer> list = new ArrayList<>();
        List<ArrayList<Integer>> list_pairs;
        list.add(9);
        list.add(-1);
        list.add(10);
        list.add(5);
        list.add(9);
        list.add(0);
        list.add(9);
        list.add(0);

        for (int elem : list)
            System.out.print(elem + " ");
        System.out.println();

        findPair(list, number);
//        System.out.println("For Number = " + number + "     Pairs:");
//        System.out.println(list);
    }
}

package com.hillel.language.basis8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            original.add(i);
        }
        System.out.println(original);
        ReverseList reverseList = new ReverseList();

        List<Integer> reversed = reverseList.reverse(original);
        System.out.println(reversed);
    }

    public List<Integer> reverse(List<Integer> list) {
        // your code here
        Collections.reverse(list);
        return list;
    }
}

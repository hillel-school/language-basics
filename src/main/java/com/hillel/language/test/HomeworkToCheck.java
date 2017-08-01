package com.hillel.language.test;

import java.util.ArrayList;
import java.util.List;

public class HomeworkToCheck {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addRandomNumbers(list);
        //list = Arrays.asList(9, 1, 1, 7, 9, 0, 2, 0, 8, 6);
        printList(list);
        sumPairNumbers(list, 10);
    }

    public static void addRandomNumbers(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i, (int) (Math.random() * 10));
        }
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void sumPairNumbers(List<Integer> list, int sumValue) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if ((i != j) && (list.get(i) + list.get(j)) == sumValue) {
                    System.out.println(list.get(i) + " + " + list.get(j) + " = " + sumValue);
                    list.set(i, sumValue);
                    list.set(j, sumValue);
                }
            }
        }
    }
}

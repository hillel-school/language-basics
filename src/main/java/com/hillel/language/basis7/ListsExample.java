package com.hillel.language.basis7;

import java.util.*;

public class ListsExample {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();

        List<String> names = new LinkedList<>();
        // add
        names.add("Andrey");
        names.add("Vasiliy");
        names.add("Anna");

        print(names);
        // remove
        names.remove(0);

        int size = names.size();
        System.out.println(size);
        print(names);

        // replace

        names.set(1, "Nikolay");
        print(names);

        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }

    static void print(List<String> list) {
        System.out.println(list);
    }
}

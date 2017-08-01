package com.hillel.language.basis9;

import com.google.common.collect.ImmutableList;

import java.util.*;

public class CollectionWrappers {

    public static void main(String[] args) {
        List<String> singletonList = Collections.singletonList("");

        singletonList.add("dsa");

        List<Integer> empty = Collections.emptyList();

        empty.add(3);

        List<Integer> modifiable = new ArrayList<>();
        modifiable.add(1);
        modifiable.add(2);

        //System.out.println(modifiable);

        List<Integer> unmodifiable = Collections.unmodifiableList(modifiable);
        unmodifiable.add(3);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 3);

        Map<Integer, Integer> synchronizedMap = Collections.synchronizedMap(map);
    }
}

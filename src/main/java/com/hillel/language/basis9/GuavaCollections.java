package com.hillel.language.basis9;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;

public class GuavaCollections {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);

        List<Integer> list2 = Lists.newArrayList(4, 3, 2, 1, null);
        List<Integer> list3 = Lists.newArrayList(4, 3, 2, 1, 1, 2, 3, 4, 1);

//        System.out.println(Iterables.contains(list, 1));
//        list.contains(1);
//        System.out.println(Iterables.frequency(list3, 4));
//        System.out.println(Iterables.filter(list, new Predicate<Integer>() {
//            @Override
//            public boolean apply(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }));

//
        System.out.println(Iterables.filter(list2, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer integer) {
                return integer != null;
            }
        }));
//        System.out.println(Iterables.frequency(list3, 1));
    }
}

package com.hillel.language.basis9;

import com.google.common.collect.Lists;

import java.util.List;

public class RemoveFromList {

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);

        for(Integer i : list) {
            if(i % 2 == 0) {
                list.remove(i);
            }
        }

    }
}

package com.hillel.language.basis10.practice;

import java.util.ArrayList;
import java.util.List;

public class Container {

    List<Integer> list = new ArrayList<>(5);

    public void add(Integer element) {
        if(list.size() < 5) {
            list.add(element);
        } else {
            list.remove(0);
            list.add(element);
        }
    }

    public List<Integer> get() {
        return list;
    }

}

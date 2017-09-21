package com.hillel.language.basis24.wait;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class WaitedObject {

    int max;

    List<Integer> numbers = ImmutableList.of(1,2,3,4,5,6,7,8,9,0,-100, 500);

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }
}

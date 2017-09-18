package com.hillel.language.basis22.datarace;

public class SharedObject {

    private int value;

    public void increment() {
        this.value++;
    }

    public int getValue() {
        return value;
    }
}

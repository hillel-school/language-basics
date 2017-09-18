package com.hillel.language.basis22.fixed_atomic;

public class AtomicSharedObject {

    private volatile long value;

    public void increment() {
        this.value++;
    }

    public long getValue() {
        return value;
    }
}

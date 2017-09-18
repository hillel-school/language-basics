package com.hillel.language.basis22.fixed_synch;

public class SynchronizedSharedObject {

    private long value;

    public synchronized void increment() {
        this.value++;
    }

    public long getValue() {
        return value;
    }
}

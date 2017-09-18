package com.hillel.language.basis22.fixed_atomic;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicSharedObject {

    private AtomicLong value = new AtomicLong(0);

    public void increment() {
        this.value.incrementAndGet();
    }

    public long getValue() {
        return value.get();
    }
}

package com.hillel.language.basis22.fixed_reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedObject {

    private volatile long value;

    private Lock lock = new ReentrantLock();

    public void increment() {
        this.lock.lock();
        try {
            this.value += 1;
        } finally {
            this.lock.unlock();
        }
    }

    public long getValue() {
        return value;
    }
}

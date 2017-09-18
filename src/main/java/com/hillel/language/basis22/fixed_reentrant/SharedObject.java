package com.hillel.language.basis22.fixed_reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedObject {

    private volatile long value;

    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
        System.out.println("Hello");
        //sdasdas;

        this.lock.lock();
        try {
            this.value++;
        } finally {
            this.lock.unlock();
        }
    }

    public long getValue() {
        return value;
    }
}

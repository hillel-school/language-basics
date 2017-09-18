package com.hillel.language.basis22.fixed_atomic;

public class Incrementor implements Runnable {

    AtomicSharedObject atomicSharedObject;

    public Incrementor(AtomicSharedObject atomicSharedObject) {
        this.atomicSharedObject = atomicSharedObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i ++) {
            atomicSharedObject.increment();
        }
    }
}

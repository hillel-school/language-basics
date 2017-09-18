package com.hillel.language.basis22.fixed_synch;

public class Incrementor implements Runnable {

    SynchronizedSharedObject synchronizedSharedObject;

    public Incrementor(SynchronizedSharedObject synchronizedSharedObject) {
        this.synchronizedSharedObject = synchronizedSharedObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i ++) {
            synchronizedSharedObject.increment();
        }
    }
}

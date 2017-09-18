package com.hillel.language.basis22.datarace;

public class IncrementingRunnable implements Runnable {

    SharedObject sharedObject;

    public IncrementingRunnable(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i ++) {
            sharedObject.increment();
        }
    }
}

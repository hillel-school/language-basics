package com.hillel.language.basis22.fixed_reentrant;

public class Incrementor implements Runnable {

    SharedObject sharedObject;

    public Incrementor(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i ++) {
            sharedObject.increment();
        }
    }
}

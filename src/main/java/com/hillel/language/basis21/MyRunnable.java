package com.hillel.language.basis21;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Class: " + this.getClass().getName()
                + " Thread: " + Thread.currentThread().getName());
    }
}

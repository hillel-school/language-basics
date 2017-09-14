package com.hillel.language.basis21;

public class SleepingThread extends Thread {

    long delay;

    public SleepingThread(long delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            sleep(this.delay);
            System.out.println("Class: " + this.getClass().getName()
                    + " Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Damn");
        }
    }
}

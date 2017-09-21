package com.hillel.language.basis24.wait;

public class Waiter implements Runnable {

    private final WaitedObject waitedObject;

    public Waiter(WaitedObject waitedObject) {
        this.waitedObject = waitedObject;
    }

    @Override
    public void run() {
        synchronized (waitedObject) {
            try {
                System.out.println("[" + this.getClass().getName() + "] " +
                        Thread.currentThread().getName() + " waiting...");
                waitedObject.wait();
                System.out.println("[" + this.getClass().getName() + "] " +
                        Thread.currentThread().getName() + " finished waiting...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("[" + this.getClass().getName() + "] " +
                Thread.currentThread().getName() + ": max: " + waitedObject.getMax());
    }
}

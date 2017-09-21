package com.hillel.language.basis24.wait;

import java.util.Collections;

public class Notifier implements Runnable {

    private final WaitedObject waitedObject;

    public Notifier(WaitedObject waitedObject) {
        this.waitedObject = waitedObject;
    }

    @Override
    public void run() {
        synchronized (waitedObject) {
            int result = Collections.max(waitedObject.numbers);
            waitedObject.setMax(result);
            try {
                System.out.println("[" + this.getClass().getName() + "] " +
                        Thread.currentThread().getName() + " is sleeping for 5000 ms");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + this.getClass().getName() + "] " +
                    Thread.currentThread().getName() + " notifying");
            waitedObject.notifyAll();
        }
    }
}

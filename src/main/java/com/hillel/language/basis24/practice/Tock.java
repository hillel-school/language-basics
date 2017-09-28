package com.hillel.language.basis24.practice;

public class Tock implements Runnable {

    final Object object;

    public Tock(Object object) {
        this.object = object;
    }

    @Override
    public  void run() {
        synchronized (object) {
                try {
                    object.wait();
                    System.out.println("Tock");
                    Thread.sleep(50);
                    object.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}

package com.hillel.language.basis24.practice;

public class Tick implements Runnable {

    boolean started = true;
    final Object object;

    public Tick(Object object) {
        this.object = object;
    }

    @Override
    public  void run() {
        synchronized (object) {
                try {
                    if (!started) {
                        object.wait();
                    }
                    started = true;
                    System.out.println("Tick");
                    Thread.sleep(50);
                    object.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}

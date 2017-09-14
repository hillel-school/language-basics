package com.hillel.language.basis21;

public class InterruptMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Class: " + Main.class.getName()
                + " Thread: " + Thread.currentThread().getName());

        SleepingThread sleepingThread = new SleepingThread(5000);
        System.out.println(sleepingThread.getState());
        sleepingThread.start();
        System.out.println(sleepingThread.getState());
        try {
            sleepingThread.join(2000);
            if (sleepingThread.isAlive()) {
                sleepingThread.interrupt();
                System.out.println(sleepingThread.getState());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.sleep(500);
        System.out.println(sleepingThread.getState());
    }
}

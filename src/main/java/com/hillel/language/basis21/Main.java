package com.hillel.language.basis21;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Class: " + Main.class.getName()
                + " Thread: " + Thread.currentThread().getName());

        Thread sleepingThread = new SleepingThread(5000);
        sleepingThread.start();

        Thread myThread = new JoiningThread(sleepingThread);
        myThread.start();
    }
}

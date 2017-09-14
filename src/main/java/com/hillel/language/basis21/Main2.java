package com.hillel.language.basis21;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(Main2.class.getName() + " " + Thread.currentThread().getName());
        Thread sleepingThread = new SleepingThread(5000);
        Thread joiningThread = new JoiningThread(sleepingThread);
        sleepingThread.start();
        joiningThread.start();
    }
}

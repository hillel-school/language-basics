package com.hillel.language.basis24.practice;

public class TickTockMain {

    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        new Thread(new Tick(object)).start();
        new Thread(new Tock(object)).start();
    }
}

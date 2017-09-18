package com.hillel.language.test;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Hello ");

        Thread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join(3000);
            if (myThread.isAlive()) {
                System.out.println("Time is out");
                myThread.interrupt();
            }
        }
        catch (InterruptedException e){
        }

        System.out.println(myThread.getState());
        System.out.print("Good Day!!!");
    }
}

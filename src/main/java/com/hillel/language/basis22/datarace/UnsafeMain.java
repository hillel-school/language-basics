package com.hillel.language.basis22.datarace;

public class UnsafeMain {

    public static void main(String[] args) throws InterruptedException {
        SharedObject sharedObject = new SharedObject();

        Thread increment = new Thread(new Incrementor(sharedObject));
        Thread increment2 = new Thread(new Incrementor(sharedObject));
        Thread increment3 = new Thread(new Incrementor(sharedObject));

        increment.start();
        increment2.start();
        increment3.start();

        Thread.sleep(2000);

        System.out.println(sharedObject.getValue());
    }
}

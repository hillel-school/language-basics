package com.hillel.language.basis22.fixed_synch;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SynchronizedSharedObject synchronizedSharedObject = new SynchronizedSharedObject();

        Thread increment = new Thread(new Incrementor(synchronizedSharedObject));
        Thread increment2 = new Thread(new Incrementor(synchronizedSharedObject));
        Thread increment3 = new Thread(new Incrementor(synchronizedSharedObject));

        increment.start();
        increment2.start();
        increment3.start();

        Thread.sleep(2000);

        System.out.println(synchronizedSharedObject.getValue());
    }
}

package com.hillel.language.basis22.fixed_atomic;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AtomicSharedObject atomicSharedObject = new AtomicSharedObject();

        Thread increment = new Thread(new Incrementor(atomicSharedObject));
        Thread increment2 = new Thread(new Incrementor(atomicSharedObject));
        Thread increment3 = new Thread(new Incrementor(atomicSharedObject));

        increment.start();
        increment2.start();
        increment3.start();

        Thread.sleep(2000);

        System.out.println(atomicSharedObject.getValue());
    }
}

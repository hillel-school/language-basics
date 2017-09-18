package com.hillel.language.basis22.datarace;

public class UnsafeMain {

    public static void main(String[] args) throws InterruptedException {
        SharedObject sharedObject = new SharedObject();

        Thread increment = new Thread(new IncrementingRunnable(sharedObject));
        Thread increment2 = new Thread(new IncrementingRunnable(sharedObject));
        Thread increment3 = new Thread(new IncrementingRunnable(sharedObject));

        increment.start();
        increment2.start();
        increment3.start();

        Thread.sleep(4000);

        Class<UnsafeMain> cc = UnsafeMain.class;

        System.out.println(sharedObject.getValue());
    }
}

package com.hillel.language.basis24.wait;

public class WaitNotifyMain {

    public static void main(String[] args) throws InterruptedException {
        WaitedObject waitedObject = new WaitedObject();

        Waiter waiter = new Waiter(waitedObject);
        Waiter waiter2 = new Waiter(waitedObject);
        Notifier notifier = new Notifier(waitedObject);

        new Thread(waiter).start();
        new Thread(waiter2).start();
        //Thread.sleep(100);
        new Thread(notifier).start();
    }
}

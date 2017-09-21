package com.hillel.language.basis23.ProducerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class MyConsumer implements Runnable {

    protected BlockingQueue<String> queue = null;

    public MyConsumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(new Random().nextInt(50));
                System.out.println(Thread.currentThread().getName() + " :" + queue.take().toUpperCase());
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }
}

package com.hillel.language.basis23.ProducerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    protected BlockingQueue<String> queue = null;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(new Random().nextInt(50));
                System.out.println(Thread.currentThread().getName() + " :" + queue.take());
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }
}

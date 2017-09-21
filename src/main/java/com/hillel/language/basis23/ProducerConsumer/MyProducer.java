package com.hillel.language.basis23.ProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MyProducer implements Runnable {

    protected BlockingQueue<String> queue = null;

    public MyProducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 30; i++) {
                queue.put(String.valueOf(i));
                //Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

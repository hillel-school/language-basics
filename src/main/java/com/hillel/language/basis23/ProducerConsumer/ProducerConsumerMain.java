package com.hillel.language.basis23.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerMain {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

        Producer p = new Producer(blockingQueue);
        Consumer c1 = new Consumer(blockingQueue);
        Consumer c2 = new Consumer(blockingQueue);
        Thread producer = new Thread(p);
        producer.start();
        Thread consumer1 = new Thread(c1);
        consumer1.start();
        Thread consumer2 = new Thread(c2);
        consumer2.start();
        ///
        producer.join();
        consumer1.interrupt();
        consumer2.interrupt();

    }
}

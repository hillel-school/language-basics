package com.hillel.language.basis23.ProducerConsumer;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBQMain {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new PriorityBlockingQueue<>(10,
                (Comparator<String>) (o1, o2) -> {
                    int one = Integer.valueOf(o1);
                    int two = Integer.valueOf(o2);
                    return Integer.compare(one % 2, two % 2);
                });

        MyProducer p = new MyProducer(blockingQueue);
        MyConsumer c1 = new MyConsumer(blockingQueue);
        MyConsumer c2 = new MyConsumer(blockingQueue);
        Thread producer = new Thread(p);
        producer.start();
        Thread consumer1 = new Thread(c1);
        consumer1.start();
        Thread consumer2 = new Thread(c2);
        consumer2.start();
        ///
        producer.join();
        Thread.sleep(2000);
        consumer1.interrupt();
        consumer2.interrupt();

    }
}

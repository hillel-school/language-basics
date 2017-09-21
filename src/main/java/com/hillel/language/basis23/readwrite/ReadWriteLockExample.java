package com.hillel.language.basis23.readwrite;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private Map<String, Integer> resource = new HashMap<>();

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public Integer get(String key) {
        lock.readLock().lock();
        try {
            System.out.println("READ start: " + Thread.currentThread().getName());
            //Thread.sleep(10);
            Integer result = resource.get(key);
            System.out.println("READ end: " + Thread.currentThread().getName());
            return result;
//        } catch (InterruptedException e) {
//            System.out.println("Was interrupted");
//            return null;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void put(String key, Integer value) {
        lock.writeLock().lock();
        try {
            System.out.println("---Start write: " + Thread.currentThread().getName());
            //Thread.sleep(15);
            resource.put(key, value);
            System.out.println("---End write: " + Thread.currentThread().getName());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}

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
            System.out.println("READ: " + Thread.currentThread().getName());
            Thread.sleep(10);
            return resource.get(key);
        } catch (InterruptedException e) {
            System.out.println("Was interrupted");
            return null;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void put(String key, Integer value) {
        lock.writeLock().lock();
        try {
            System.out.println("---Start write: " + Thread.currentThread().getName());
            Thread.sleep(15);
            resource.put(key, value);
            System.out.println("---End write: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}

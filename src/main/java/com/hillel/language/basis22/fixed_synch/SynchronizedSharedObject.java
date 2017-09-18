package com.hillel.language.basis22.fixed_synch;

public class SynchronizedSharedObject {

    private long value;

    private final Object lock = new Object();

    public synchronized void increment() {
        this.value++;
    }

    public long getValue() {
      synchronized (this.lock) {
          return value;
      }
    }
}

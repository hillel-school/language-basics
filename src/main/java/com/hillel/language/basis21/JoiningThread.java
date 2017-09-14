package com.hillel.language.basis21;

public class JoiningThread extends Thread{

    private Thread otherThread;

    public JoiningThread(Thread otherThread) {
        this.otherThread = otherThread;
    }

    @Override
    public void run() {
        try {
            this.otherThread.join(3000);
            System.out.println(getClass().getName() + " " + currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

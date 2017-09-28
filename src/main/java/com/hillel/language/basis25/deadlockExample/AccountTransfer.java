package com.hillel.language.basis25.deadlockExample;

public class AccountTransfer implements Runnable {

    final Account from;
    final Account to;

    public AccountTransfer(Account from, Account to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {

        Account firstLock = null;
        Account secondLock = null;

        if(from.hashCode() > to.hashCode()) {
            firstLock = from;
            secondLock = to;
        }
        else {
            firstLock = to;
            secondLock = from;
        }

        synchronized (firstLock) {
            synchronized (secondLock) {
                from.setAmount(from.getAmount() - 1);
                to.setAmount(to.getAmount() - 1);
                System.out.println("Transferred");
            }
        }
    }
}

package com.hillel.language.basis25.deadlockExample;

public class Account {

    private long amount;

    private long id;

    public Account(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }
}

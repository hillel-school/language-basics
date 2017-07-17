package com.hillel.language.basis5;

public abstract class Furniture implements Repairable {

    int cost;

    public Furniture(int cost) {
        this.cost = cost;
    }

    public Furniture() {

    }

    public abstract boolean isWooden();

    public int getCost() {
        return cost;
    }
}

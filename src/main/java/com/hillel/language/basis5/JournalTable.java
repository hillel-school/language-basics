package com.hillel.language.basis5;

public class JournalTable extends Furniture {

    private static final int DURABILITY = 50;

    public JournalTable(int cost) {
        super(cost);
    }

    @Override
    public boolean isWooden() {
        return true;
    }

    @Override
    public boolean canRepair(int damageFactor) {
        return damageFactor < DURABILITY;
    }


    @Override
    public int getCost() {
        return (int)(super.getCost() * 1.1);
    }
}

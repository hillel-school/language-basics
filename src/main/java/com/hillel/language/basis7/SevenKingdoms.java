package com.hillel.language.basis7;

public enum SevenKingdoms {

    JAN(12),
    FEB(13);

    int days;

    SevenKingdoms(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return this.name();
    }
}

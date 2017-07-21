package com.hillel.language.basis7;

public enum SevenKingdoms {

    JAN("31"),
    FEB("28");

    String days;

    SevenKingdoms(String days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return this.days != null ? this.days : this.name();
    }
}

package com.hillel.language.basis7;

public final class EnumSimulation {

    public static final EnumSimulation JANUARY = new EnumSimulation("31");


    private String days;

    private EnumSimulation(String days) {
        this.days = days;
    }
}

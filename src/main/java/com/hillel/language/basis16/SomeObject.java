package com.hillel.language.basis16;

import java.io.Serializable;

public class SomeObject implements Serializable {

    private int i;
    private String s;

    public SomeObject(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }
}

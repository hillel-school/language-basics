package com.hillel.language.basis7;

public class JustAContainer<T> {

    T[] a;

    public JustAContainer(T[] a) {

    }

    public void add(T member) {
        a[0] = member;
    }

    public int size() {
        return this.a.length;
    }
}

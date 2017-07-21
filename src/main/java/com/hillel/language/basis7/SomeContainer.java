package com.hillel.language.basis7;

public class SomeContainer<T> {

    T[] array;

    public SomeContainer(T[] parameter) {
        this.array = parameter;
    }

    public void print(T t) {
        System.out.println(t.toString());
    }

    public int size() {
        return array.length;
    }
}

package com.hillel.language.basis7;

public class NumberContainer<T extends Number> {

    T number;

    public NumberContainer(T parameter) {
        this.number = parameter;
    }

    public T getNumber() {
        return this.number;
    }

    public int compareTo(NumberContainer<? extends Number> other) {
       return Double.compare(this.getNumber().doubleValue(), other.getNumber().doubleValue());
    }
}

package com.hillel.language.basis7;

public class NumberContainer2<T extends Number> {

    T number;

    public NumberContainer2(T parameter) {
        this.number = parameter;
    }

    public T getNumber() {
        return this.number;
    }

    public int compareTo(NumberContainer2<? extends Number> other) {
        return Double.compare(this.getNumber().doubleValue(), other.getNumber().doubleValue());
    }
}

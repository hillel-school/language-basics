package com.hillel.language.basis6;

import java.util.Objects;

public class EqualsAndHashCodeExample {

    int i;
    String c;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCodeExample that = (EqualsAndHashCodeExample) o;
        return i == that.i &&
                Objects.equals(c, that.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, c);
    }
}

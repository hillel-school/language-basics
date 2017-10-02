package com.hillel.language.junk;

import java.util.StringJoiner;
import java.util.function.IntSupplier;
import java.util.stream.Stream;

public class Main {

    private static int i;

    public static void main(String[] args) {
        IntSupplier[] lambdas = new IntSupplier[10];

        for (i = 0; i < 10; i++) {
            lambdas[i] = () -> i;
        }

        System.out.println(Stream.of(lambdas).mapToInt(IntSupplier::getAsInt).sum());
    }
}

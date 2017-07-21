package com.hillel.language.basis7;

public class TestNumberContainer {

    public static void main(String[] args) {

        NumberContainer<Integer> integerNumberContainer = new NumberContainer<>(3);
        NumberContainer<Integer> integerNumberContainer2 = new NumberContainer<>(4);

        int result = integerNumberContainer.compareTo(integerNumberContainer2);

        System.out.println(result);

        NumberContainer<Double> doubleNumberContainer = new NumberContainer<>(3.3);

        result = integerNumberContainer.compareTo(doubleNumberContainer);
//
//        NumberContainer2<Integer> integerNumberContainerUpgraded = new NumberContainer2<>(3);
//        NumberContainer2<Double> doubleNumberContainerUpgraded = new NumberContainer2<>(3.3);
//
//        result = integerNumberContainerUpgraded.compareTo(doubleNumberContainerUpgraded);

    }
}

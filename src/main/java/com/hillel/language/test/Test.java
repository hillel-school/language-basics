package com.hillel.language.test;

import com.hillel.language.basis7.JustAContainer;

public class Test {

    //@SuppressWarnings(value = "unchecked")
    public static void main(String[] args) {
        String[] a = {""};
        Integer[] b = new Integer[5];
        JustAContainer<String> container = new JustAContainer<>(a);
        JustAContainer container1 = new JustAContainer<>(b);
        container.add("");
    }
}

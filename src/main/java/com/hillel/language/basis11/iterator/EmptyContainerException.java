package com.hillel.language.basis11.iterator;

public class EmptyContainerException extends Exception {

    @Override
    public String getMessage() {
        return "No elements found in container!";
    }
}

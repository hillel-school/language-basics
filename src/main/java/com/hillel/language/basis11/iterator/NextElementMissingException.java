package com.hillel.language.basis11.iterator;

public class NextElementMissingException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Next element missing!";
    }
}

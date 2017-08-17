package com.hillel.language.basis14.homework;

import java.io.File;

public class NewMainClass {

    public static void main(String[] args) {
        NonStaticContainer nonStaticContainer = new NonStaticContainer();
        nonStaticContainer.increment();
        File f = openFile("bla");
        System.out.println(nonStaticContainer.value);
    }


    static File openFile(String filename) {
        NonStaticContainer nonStaticContainer = new NonStaticContainer();
        nonStaticContainer.increment();
        return new File(filename);
    }
}

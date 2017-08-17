package com.hillel.language.basis14.homework;

import java.io.File;

public class MainClass {

    public static void main(String[] args) {

        StaticContainer.increment();
        File f = openFile("fileName");
        System.out.println(StaticContainer.value);
    }

    static File openFile(String filename) {
        StaticContainer.increment();
        return new File(filename);
    }
}

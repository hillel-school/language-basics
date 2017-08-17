package com.hillel.language.basis13;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public static final String FILENAME = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file3.txt";

    public static void main(String[] args) throws IOException {

        RandomAccessFile file = new RandomAccessFile(FILENAME, "rw");

        String line = file.readLine();
        System.out.println(line);

        line = file.readLine();
        System.out.println(line);
        file.skipBytes(2);
        file.writeBytes("we have broken child song");
    }
}

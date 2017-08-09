package com.hillel.language.basis12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteStreams {

    public static final String FILENAME_SOURCE = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file.txt";
    public static final String FILENAME_TARGET = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file2.txt";

    public static void main(String[] args) throws IOException {

        characterStream();
    }

    private static void byteStream() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(FILENAME_SOURCE);
            out = new FileOutputStream(FILENAME_TARGET);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    private static void characterStream() throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(FILENAME_SOURCE);
            outputStream = new FileWriter(FILENAME_TARGET);

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char)c);
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

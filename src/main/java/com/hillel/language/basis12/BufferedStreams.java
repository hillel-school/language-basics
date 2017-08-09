package com.hillel.language.basis12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import static com.hillel.language.basis12.ReadWriteStreams.FILENAME_SOURCE;
import static com.hillel.language.basis12.ReadWriteStreams.FILENAME_TARGET;

public class BufferedStreams {

    public static void main(String[] args) throws IOException {

        characterStream();
    }

    private static void byteStream() throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream(FILENAME_SOURCE));
            out = new BufferedOutputStream(new FileOutputStream(FILENAME_TARGET), 20);
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
        //BufferedReader bufferedReader = null;
        //BufferedWriter bufferedWriter = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME_SOURCE));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILENAME_TARGET))) {
            //bufferedReader = new BufferedReader(new FileReader(FILENAME_SOURCE));
            //bufferedWriter = new BufferedWriter(new FileWriter(FILENAME_TARGET));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
                bufferedWriter.write(line);
            }
        }
//        catch (IOException e) {
//
//        }
    }
}

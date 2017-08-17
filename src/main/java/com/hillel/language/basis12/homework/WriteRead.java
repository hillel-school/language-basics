package com.hillel.language.basis12.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteRead {

    public static void main(String[] args) throws IOException {
        String pathToFile = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file.txt";
        File textTime = new File(pathToFile);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(textTime));

        for (int i = 0; i < 200; i++) {
            bufferedWriter.write('x');
        }
        bufferedWriter.flush();

        FileReader fileReader = new FileReader(textTime);
        int c;
        long startFileReader = System.currentTimeMillis();
        while ((c = fileReader.read()) != -1 ) {

        }

        long endFileReader = System.currentTimeMillis();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(textTime));

        long startBufferedReader = System.currentTimeMillis();
        while ((c = bufferedReader.read()) != -1 ) {

        }
        long endBufferedReader = System.currentTimeMillis();

        System.out.println((endFileReader - startFileReader) + "-FileReader\n" +
                (endBufferedReader - startBufferedReader) + "-BufferedReader");
    }
}

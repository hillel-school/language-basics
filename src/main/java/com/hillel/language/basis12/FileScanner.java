package com.hillel.language.basis12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static com.hillel.language.basis12.ReadWriteStreams.FILENAME_SOURCE;

public class FileScanner {

    public static void main(String[] args) throws IOException {

        // Scanner s = null;

        try (Scanner s = new Scanner(new BufferedReader(new FileReader(FILENAME_SOURCE)))) {
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        }
    }
}

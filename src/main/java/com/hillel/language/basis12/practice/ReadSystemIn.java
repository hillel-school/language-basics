package com.hillel.language.basis12.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.hillel.language.basis12.ReadWriteStreams.FILENAME_TARGET;

public class ReadSystemIn {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (!(s = reader.readLine()).equals("")) {
            System.out.println(s);
        }
    }
}

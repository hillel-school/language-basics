package com.hillel.language.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyThread extends Thread {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

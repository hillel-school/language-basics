package com.hillel.language.basis15.practice;

public class Main {

    public static void main(String[] args) {
        handle(new ConsoleReader(), new FileScanner(""));
    }

    private static void handle(Reader reader, FileScanner scanner) {
        String input = reader.read();
        int occurences = scanner.scan(input);
    }
}

package com.hillel.language.basis5;

public class Test5 {

    public static void main(String... args) {
        Furniture f = new JournalTable(100);

        System.out.println(f.getCost());
        System.out.println(f.isWooden());
    }
}

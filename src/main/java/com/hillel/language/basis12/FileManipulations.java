package com.hillel.language.basis12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileManipulations {

    public static void main(String[] args) throws IOException {

//        String path = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file.txt";
//        File file = new File(path);
//
//        if (file.exists()) {
//            System.out.println(file.getAbsolutePath());
//            System.out.println(Arrays.toString(file.list()));
//        }

        String path2 = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file2.txt";
        File file2 = new File(path2);
        if (!file2.exists()) {
            System.out.println(file2.createNewFile());
        }
        System.out.println("is directory file2: " + file2.isDirectory());

        String s = file2.getParent();
        File file3 = new File(s);
        System.out.println("file3 parent" + file3.getParent());

        System.out.println(Arrays.toString(file3.list()));
     }


}

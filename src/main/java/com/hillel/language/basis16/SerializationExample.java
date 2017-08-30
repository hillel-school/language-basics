package com.hillel.language.basis16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String[] args) throws IOException {
        OneMoreObject someObject = new OneMoreObject();
        File f = new File("./src/main/resources/temp.ser");
        if (!f.exists()) {
            f.createNewFile();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            oos.writeObject(someObject);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            OneMoreObject from = (OneMoreObject) ois.readObject();
            System.out.println(from.isD());
        } catch (ClassNotFoundException e ) {
            System.out.println(e.getMessage());
        }
    }
}

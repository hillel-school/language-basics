package com.hillel.language.basis13;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelExample {

    public static final String FILENAME = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file4.txt";

    public static void main(String[] args) {
        Path path = Paths.get(FILENAME);

        String s = "\nWe got here!";
        byte data[] = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);

        try {
            FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.APPEND);

            fileChannel.position(0);
            while(out.hasRemaining()) {
                fileChannel.write(out);
            }
            out.rewind();

        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}

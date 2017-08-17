package com.hillel.language.basis13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InsertALine {

    public static final String FILENAME = "/Users/alexstybaev/IdeaProjects/Hillel/src/main/resources/file4.txt";

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(FILENAME);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        int position = 2;
        String extraLine = "This is an extraline";

        lines.add(position, extraLine);
        // Files.write(path, lines, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
        for(String line : lines) {
            bw.append(line);
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }


}

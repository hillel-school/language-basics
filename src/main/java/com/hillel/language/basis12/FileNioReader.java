package com.hillel.language.basis12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static com.hillel.language.basis12.ReadWriteStreams.FILENAME_SOURCE;

public class FileNioReader {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(FILENAME_SOURCE);
        Path file3 = path.resolveSibling("file3.txt");
        if (!Files.exists(file3)) {
            file3 = Files.createFile(file3);
        }
        System.out.println(file3.toAbsolutePath().toString());

        String s = "Whatever string";
        try(BufferedWriter writer = Files.newBufferedWriter(file3)) {
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        Path directory = Files.createDirectory(file3.resolveSibling("directory"));
        Path newPath = directory.resolve(file3.getFileName());

        // moveFiles(file3, newPath);

        // deleteFile(newPath);
    }

    private static void moveFiles(Path oldPath, Path newPath) throws IOException {
        Files.move(oldPath, newPath, StandardCopyOption.ATOMIC_MOVE);
    }

    private static void deleteFile(Path path) throws IOException {
        Files.delete(path);
    }
}

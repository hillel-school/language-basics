package com.hillel.language.basis18;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileReader;

public class JacksonMapping {

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        Student student;
        try(FileReader fileReader = new FileReader("src/main/java/com/hillel/language/basis18/student.json")) {
            student = objectMapper.readValue(fileReader, Student.class);
        }
        System.out.println(student.getName());
    }
}

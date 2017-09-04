package com.hillel.language.basis18;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

public class JsonParser {

    public static void main(String[] args) throws Exception{
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/main/java/com/hillel/language/basis18/student.json"));

        JSONObject jsonObject = (JSONObject) obj;
        System.out.println(jsonObject);
        System.out.println("------------------------");
        JSONObject student = (JSONObject) jsonObject.get("student");
        System.out.println(student);
        student.putIfAbsent("gender", "male");
        System.out.println(jsonObject);

        try(FileWriter fileWriter = new FileWriter("src/main/java/com/hillel/language/basis18/student2.json")) {
            jsonObject.writeJSONString(fileWriter);
        }
    }
}

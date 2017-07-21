package com.hillel.language.basis7;

import java.util.HashMap;
import java.util.Map;

public class AnnotationsExample implements AnnotationsExampleInterface {

    @Override
    public void deprecatedMethod(String... args) {

    }

    @SuppressWarnings(value = "all")
    public static void main(String[] args) {
        AnnotationsExample example = new AnnotationsExample();
        example.deprecatedMethod();
        Map map = new HashMap<>();
        map.put("1", "1");
    }
}

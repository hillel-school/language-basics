package com.hillel.language.basis14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d");
        //Pattern pattern = Pattern.compile("(\\w|\\s){1,}");
        Matcher matcher = pattern.matcher("The answer is 42");

        System.out.println(matcher.matches());
        System.out.println(matcher.lookingAt());

//        System.out.println(matcher.find());
//        System.out.println(matcher.group());

//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
    }
}

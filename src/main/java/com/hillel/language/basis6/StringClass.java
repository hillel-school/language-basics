package com.hillel.language.basis6;

public class StringClass {

    public static void main(String[] args) {

        String s = "hillel";
        String s1 = new String("hillel");

        // interning
//        String example1 = "Java";
//        String example2 = new String("Java");
//        String example3 = "Java";
//
//        System.out.println(example1 == example2);
//        System.out.println(example1 == example3);
//        System.out.println(example1.equals(example2));
//
//        example2.intern();
//        System.out.println(example1 == example2);
//
//        example2 = example2.intern();
//        System.out.println(example1 == example2);
//
        // +, +=
        String s2 = s + " class";
        s += " school";
//        System.out.println(s2);
//        System.out.println(s);
////
////        // substring
        String hillel = s.substring(0, 7);
        String school = s.substring(7);
//        System.out.println(hillel);
//        System.out.println(school);

        // string format
        int i = 12;
        String formatted = String.format("We got %d students here in %s", i, hillel);
        System.out.println(formatted);

        String formatted2 = String.format("%2$s, %1$s", "1", "2");
        System.out.println(formatted2);
    }
}

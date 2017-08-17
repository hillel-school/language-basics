package com.hillel.language.basis14;

public class StringBuilderBuffer {

    public static void main(String[] args) {

        StringBuffer builder = new StringBuffer();

        // appending
        builder.append("Hello Hillel");
        builder.append(" ");
        builder.append(true);
        System.currentTimeMillis();
        System.out.println(builder);

        // removing

        builder.delete(12, builder.length());
        System.out.println(builder);
//
//        // inserting
//
        builder.insert(5, ",");
        System.out.println(builder);

        String result = builder.reverse().toString();

        System.out.println(result);
    }
}

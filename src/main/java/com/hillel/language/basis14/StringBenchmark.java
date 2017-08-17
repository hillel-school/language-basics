package com.hillel.language.basis14;

public class StringBenchmark {

    public static void main(String[] args) {

        long start2 = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 400000; i++) {
            builder.append(i);
        }
        String result = builder.toString();
        long end2 = System.currentTimeMillis();

        System.out.println(end2 - start2);

        StringBuffer s = new StringBuffer();

        System.out.println("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 400000; i++) {
            s.append(i);
        }
        String result1 = s.toString();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        //System.out.println(s);


        //System.out.println(result);
    }
}

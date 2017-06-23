package com.hillel.language.basis3;

public class MoreArrays {

    public static void main(String[] args) {
        int[][] twoDimensional = new int[10][10];

        int[] oneDimensional = {1, 2, 3, 4};

        String[] s = {"hi", "bye"};

        {
            int[][] twoDimensional2 = {{1,2}, {2,3}};
        }

//        for(int a : oneDimensional) {
//            System.out.println(a);
//        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

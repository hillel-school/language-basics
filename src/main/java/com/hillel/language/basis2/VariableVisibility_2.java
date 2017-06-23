package com.hillel.language.basis2;

/**
 * Created by alexstybaev on 6/18/17.
 */
public class VariableVisibility_2 {

    static int variable = 1;

    public static void main(String[] args) {
        int variable = 0;
        int local = 2;

        if (variable > 0) {
            int count = 0;


            while (count < 10) {
                count++;

                if (count % 3 == 0) {
                    //                int local = 5;
                    System.out.println(local);
                }
            }
        }

//        System.out.println(count);

        System.out.println(variable);
    }
}

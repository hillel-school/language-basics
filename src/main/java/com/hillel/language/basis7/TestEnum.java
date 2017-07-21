package com.hillel.language.basis7;

public class TestEnum {

    public static void main(String[] args) {
        System.out.println(SevenKingdoms.values());
        System.out.println(SevenKingdoms.FEB);
    }

    public static String testSwitch(SevenKingdoms family) {
        switch (family) {
            case FEB: {
                return "";
            }
            default:
                return "";
        }
    }
}

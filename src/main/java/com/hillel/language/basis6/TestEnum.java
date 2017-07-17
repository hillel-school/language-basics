package com.hillel.language.basis6;

public class TestEnum {

    public static void main(String[] args) {
        System.out.println(SevenKingdoms.TULLY);
        System.out.println(SevenKingdoms.LANNISTER);
    }

    public static String testSwitch(SevenKingdoms family) {
        switch (family) {
            case BARATHEON: {
                return "";
            }
            default:
                return "";
        }
    }
}

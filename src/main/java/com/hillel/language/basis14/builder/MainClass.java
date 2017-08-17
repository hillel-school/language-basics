package com.hillel.language.basis14.builder;

public class MainClass {

    public static void main(String[] args) {
        RpgCharacter rpgCharacter = new RpgCharacter(12, "John", "white", 12.2, 33, Gender.MALE, CharacterClass.WIZARD);

        BetterRpgCharacter betterRpgCharacter = BetterRpgCharacter.builder(22.3)
                .withAge(12)
                .withCharacterClass(CharacterClass.ROGUE)
                .withGender(Gender.FEMALE)
                .withHairColor("white")
                .build();
        System.out.println(betterRpgCharacter);
    }
}

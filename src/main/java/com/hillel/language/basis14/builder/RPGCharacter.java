package com.hillel.language.basis14.builder;

public class RpgCharacter {

    private int age;
    private String name;
    private String hairColor;
    private double height;
    private double weight;
    private Gender gender;
    private CharacterClass characterClass;

    public RpgCharacter(int age, String name, String hairColor, double height, double weight,
                        Gender gender, CharacterClass characterClass) {
        this.age = age;
        this.name = name;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.characterClass = characterClass;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }
}

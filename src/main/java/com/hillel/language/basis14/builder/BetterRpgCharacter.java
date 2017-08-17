package com.hillel.language.basis14.builder;

public class BetterRpgCharacter {

    private int age;
    private String name;
    private String hairColor;
    private double height;
    private double weight;
    private Gender gender;
    private CharacterClass characterClass;

    @Override
    public String toString() {
        return "BetterRpgCharacter{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", characterClass=" + characterClass +
                '}';
    }

    // not visible
    private BetterRpgCharacter(Builder builder){
        this.age = builder.age;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.height = builder.height;
        this.weight = builder.weight;
        this.gender = builder.gender;
        this.characterClass = builder.characterClass;
    }

    // visible
    public static Builder builder(double weight) {
        return new Builder(weight);
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

    public static class Builder {
        private int age;
        private String name;
        private String hairColor;
        private double height;
        private double weight;
        private Gender gender;
        private CharacterClass characterClass;

        private Builder(double weight) {
            this.weight = weight;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withHeight(double height) {
            this.height = height;
            return this;
        }

//        public Builder withWeight(double weight) {
//            this.weight = weight;
//            return this;
//        }

        public Builder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder withCharacterClass(CharacterClass characterClass) {
            this.characterClass = characterClass;
            return this;
        }

        public BetterRpgCharacter build() {
            return new BetterRpgCharacter(this);
        }
    }
}

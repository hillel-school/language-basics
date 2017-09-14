package com.hillel.language.basis19;

public class FindBySplit implements CharacterFinder{

    public int findNumberOfCharacters(String searchString, char character) {
        if (searchString == null) {
            return 0;
        }
        return searchString.toLowerCase().split(String.valueOf(character)).length - 1;
    }
}

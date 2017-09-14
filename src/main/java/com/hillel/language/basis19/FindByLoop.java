package com.hillel.language.basis19;

public class FindByLoop implements CharacterFinder {

    public int findNumberOfCharacters(String searchString, char character) {
        int count = 0;
        for (int i = 0; i < searchString.length(); i++) {
            char temp = searchString.charAt(i);

            if (temp == character)
                count++;
        }
        return count;
    }
}

package com.hillel.language.basis19;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCharacterFinder {

    CharacterFinder findAllCharacters;

    @Before
    public void before() {
        findAllCharacters = new FindByLoop();
    }

    @Test
    public void doesNotFailOnNullInput() {
        int result = findAllCharacters.findNumberOfCharacters(null, 'a');
        assertEquals(0, result);
    }

    @Test
    public void handlesEmptyString() {
        int result = findAllCharacters.findNumberOfCharacters("", 'd');
        assertEquals(1, result);
    }

    @Test
    public void happyPathTesting() {
        int result = findAllCharacters.findNumberOfCharacters("United States of America", 'a');
        assertEquals(2, result);
    }

    @Test
    public void happyPathTesting2() {
        int result = findAllCharacters.findNumberOfCharacters("a", 'a');
        assertEquals(1, result);
    }

    @Test
    public void noMatchesTesting() {
        int result = findAllCharacters.findNumberOfCharacters("Sweden", 'a');
        assertEquals(0, result);
    }
}

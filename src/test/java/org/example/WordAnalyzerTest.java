package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyzerTest {
    WordAnalyzer wa;
    String input;
    String input2;
    @BeforeEach
    public void setUp() {
        //Arrange
         wa = new WordAnalyzer();
        input = "We are learning Java in test.";
        input2 = "This is a fairly boring thing.";
    }

    @Test
    @DisplayName("return longest words")
    void findLongestWords() {
    assertAll("return longest words",
            () -> assertArrayEquals(new String[]{"learning"}, wa.findLongestWords(input)),
            ()-> assertArrayEquals(new String[]{"fairly", "boring"}, wa.findLongestWords(input2)));
    }

    @Test
    void calculateLetterFrequency() {
        assertAll("Return the frequency for the letter",
                () -> assertEquals(4, wa.calculateLetterFrequency(input).get('a')),
                () -> assertEquals(5, wa.calculateLetterFrequency(input2).get('i')),
                () -> assertEquals(1, wa.calculateLetterFrequency(input2).get('b')),
                () -> assertNull(wa.calculateLetterFrequency(input2).get('x')));
    }
}
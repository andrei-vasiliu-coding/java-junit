package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseString() {
        String word = "Hi";
        String word2 = "Northcoders";
        String word3 = "This is a sentence.";

        String wordReversed = "iH";
        String word2Reversed = "sredochtroN";
        String word3Reversed = ".ecnetnes a si sihT";

        StringManipulator newSM = new StringManipulator();

        assertEquals(wordReversed, newSM.reverseString(word));
        assertEquals(word2Reversed, newSM.reverseString(word2));
        assertEquals(word3Reversed, newSM.reverseString(word3));
    }

    @Test
    void isPalindrome() {
        String word = "kayak";
        String word2 = "rotator";
        String word3 = "This is a sentence.";

        StringManipulator newSM = new StringManipulator();

        assertTrue(newSM.isPalindrome(word));
        assertTrue(newSM.isPalindrome(word2));
        assertFalse(newSM.isPalindrome(word3));
    }
}
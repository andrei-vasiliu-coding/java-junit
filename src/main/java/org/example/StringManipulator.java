package org.example;

public class StringManipulator {
    public String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string
        StringBuilder inputInSB = new StringBuilder();
        inputInSB.append(input);
        inputInSB.reverse();

        return inputInSB.toString();
    }

    public boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)
        StringBuilder inputInSB = new StringBuilder();
        inputInSB.append(input);
        inputInSB.reverse();

        if (input.equalsIgnoreCase(String.valueOf(inputInSB))) {
            return true;
        }

        return false;
    }
}
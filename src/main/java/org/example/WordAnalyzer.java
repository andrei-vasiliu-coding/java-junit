package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyzer {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        ArrayList<String> longestWordArrayList = new ArrayList<>();
        text = text.replaceAll("[.]", "");
        String[] splitWord = text.split(" ", 0);
        String longestWord = splitWord[0];

        for (int i = 0; i < splitWord.length - 1; i++) {
            if (longestWord.length() < splitWord[i + 1].length()) {
                longestWord = splitWord[i + 1];
            }
        }
        longestWordArrayList.add(longestWord);

        for (int i = 0; i < splitWord.length; i++) {
            if (!longestWord.equals(splitWord[i]) && longestWord.length() == splitWord[i].length()) {
                longestWordArrayList.add(splitWord[i]);
            }
        }

        String[] finalArray = new String[longestWordArrayList.size()];
        finalArray = longestWordArrayList.toArray(finalArray);
        return finalArray;

//        for (int i = 0; i < splitWord.length - 1; i++) {
//
//            if (longestWord.length() < splitWord[i + 1].length()) {
//                longestWord = splitWord[i + 1];
//            } else if (longestWord.length() == splitWord[i + 1].length()) {
//                longestWordArrayList.add(splitWord[i + 1]);
//            }
//        }
//        longestWordArrayList.add(longestWord);
//        String[] finalArray = new String[longestWordArrayList.size()];
//        for (int i = 0; i < longestWordArrayList.size(); i++) {
//            finalArray[i] = longestWordArrayList.get(i);
//        }
//
//        for (String word: finalArray) {
//            System.out.println(word);
//        }
//        System.out.println("------");
//        return finalArray;
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        HashMap<Character, Integer> ourMap = new HashMap<>();

        Character[] alphabet = {'A', 'a'};
        for (int i = 0; i < text.length(); i++) {
            ourMap.put(text.charAt(i), ourMap.getOrDefault(text.charAt(i), 0) + 1);
        }

        System.out.println(ourMap);
        System.out.println(ourMap.get('a')); //single quotation for character, double for string

        return ourMap;
    }
}
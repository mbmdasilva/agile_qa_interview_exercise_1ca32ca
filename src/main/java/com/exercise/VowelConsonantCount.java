package com.exercise;

import java.util.*;

public class VowelConsonantCount {

    private static final Map<String, Integer> vowelCount = new HashMap<>();
    //Map<String, List<Map<String, Integer>>> vowelConsonant = new HashMap<>();
    private static final int MAX_NUM_STRINGS = 4;

    public static Map<String, List<Map<String, Integer>>> getVowelsCountForStringList(List<String> words) {
        if (words.size() > MAX_NUM_STRINGS) {
            throw new RuntimeException("Exceed the number of arguments allowed. You provided " + words.size() + " words.");
        } else {
            Map<String, List<Map<String, Integer>>> vowelConsonant = new HashMap<>();
            words.forEach(argument -> {
                List<Map<String, Integer>> vowelConsonantList = new ArrayList<>();
                vowelConsonantList.add(Map.of(LetterType.VOWEL.getValue(), getLetterTypeCount(argument, LetterType.VOWEL)));
                vowelConsonantList.add(Map.of(LetterType.CONSONANT.getValue(), getLetterTypeCount(argument, LetterType.CONSONANT)));
                vowelConsonant.put(argument, vowelConsonantList );
                });

            return vowelConsonant;
        }
    }


    private static int getLetterTypeCount(String input, LetterType type) {
        String[] inputChars = input.split("");
        if (type.getValue().equalsIgnoreCase("vowel")) {
            return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.toLowerCase().matches("[aeiou]")).count();
        } else {
            return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.toLowerCase().matches("[bcdfghjklmnpqrstvwxyz]")).count();
        }
    }

}

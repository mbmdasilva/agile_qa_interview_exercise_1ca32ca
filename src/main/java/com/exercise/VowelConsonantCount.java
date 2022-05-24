package com.exercise;

import java.util.*;

public class VowelConsonantCount {

    private static final Map<String, Integer> vowelCount = new HashMap<>();
    private static final int MAX_NUM_STRINGS = 4;

    public static Map<String, Integer> getVowelsCountForString(List<String> words) throws Exception {
        if (words.size() > MAX_NUM_STRINGS) {
            throw new Exception("Exceed the number of arguments allowed. You provided " + words.size() + " words.");
        } else {
            words.forEach(argument -> vowelCount.put(argument, getVowelCount(argument)));
            return vowelCount;
        }
    }


    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }
}

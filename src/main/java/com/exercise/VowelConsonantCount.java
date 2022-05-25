package com.exercise;

import java.util.*;

public class VowelConsonantCount {

    private static final Map<String, Integer> vowelCount = new HashMap<>();
    private static final Map<String, Integer> consonantCount = new HashMap<>();
    private static final int MAX_NUM_STRINGS = 4;

    public static Map<String, Integer> getVowelsCountForStringList(List<String> words)  {
        if (words.size() > MAX_NUM_STRINGS) {
            throw new RuntimeException("Exceed the number of arguments allowed. You provided " + words.size() + " words.");
        } else
        {
            words.forEach(argument -> vowelCount.put(argument, getVowelCount(argument)));
            return vowelCount;
        }

    }

    public static Map<String, Integer> getConsonantsCountForStringList(List<String> words){
        if (words.size() > MAX_NUM_STRINGS) {
            throw new RuntimeException("Exceed the number of arguments allowed. You provided " + words.size() + " words.");
        } else
        {
            words.forEach(argument -> consonantCount.put(argument, getConsonantCount(argument)));
            return consonantCount;
        }

    }


    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiouAEIOU]")).count();
    }

    private static Integer getConsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[bcdfghjklmnpqrstvwxyz]")).count();
    }
}

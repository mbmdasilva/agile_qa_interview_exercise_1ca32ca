package com.exercise;

public enum LetterType {

    VOWEL("vowel"),
    CONSONANT("consonant");
    String value;

    LetterType(String text) {
        value = text;
    }

    public String getValue() {
        return value;
    }

}

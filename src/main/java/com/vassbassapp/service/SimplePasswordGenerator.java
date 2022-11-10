package com.vassbassapp.service;

import java.util.Random;

public class SimplePasswordGenerator implements PasswordGenerator {

    private final Locale locale;

    public SimplePasswordGenerator() {
        locale = Locale.ENGLISH;
    }

    public SimplePasswordGenerator(Locale locale) {
        this.locale = locale;
    }

    @Override
    public String generatePassword(Difficult difficultyLevel) {
        String alphabet = locale.getAlphabet();
        Random generator = new Random();
        StringBuilder builder = new StringBuilder();

        int length = switch (difficultyLevel) {
            case EASY -> 4;
            case MEDIUM -> 8;
            case HARD -> 12;
        };

        for (int i=0;i<length;i++){
            builder.append(alphabet.charAt(generator.nextInt(0,alphabet.length())));
        }
        return builder.toString();
    }
}

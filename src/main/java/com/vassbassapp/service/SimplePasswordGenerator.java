package com.vassbassapp.service;

import java.util.Random;

public class SimplePasswordGenerator implements PasswordGenerator {
    private static final String ALPHABET = "0123456789" +
            "abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public String generatePassword(Difficult difficultyLevel) {
        Random generator = new Random();
        StringBuilder builder = new StringBuilder();

        int length = switch (difficultyLevel) {
            case EASY -> 4;
            case MEDIUM -> 8;
            case HARD -> 12;
        };

        for (int i=0;i<length;i++){
            builder.append(ALPHABET.charAt(generator.nextInt(0,ALPHABET.length())));
        }
        return builder.toString();
    }
}

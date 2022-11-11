package com.vassbassapp.service.paswordGenerator;

public enum Locale {
    ENGLISH("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    UKRAINE("0123456789абвгґдеєжзиіїйклмнопрстуфхцчшщьюяАБВГҐДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЬЮЯ");

    private final String alphabet;
    Locale(final String a) { alphabet = a; }
    public String getAlphabet() { return alphabet; }
}

package com.example.solutions.patterns.builder;

import com.example.solutions.patterns.builder.builders.Builder;

public class Director {

    public void constructAutoUser(Builder builder) {
        builder.setLogin("temporaryemail@mail.ua");
        builder.setPassword("rootroot");
        builder.setTimestamp(1L);
    }

    public void constructManualUser(Builder builder) {
        builder.setLogin("oleg6000@mail.ua");
        builder.setPassword("password");
        builder.setTimestamp(1000L);
    }
}
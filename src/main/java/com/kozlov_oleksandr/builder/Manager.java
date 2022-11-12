package com.kozlov_oleksandr.builder;

public class Manager {
    public void constructUser(Builder builder){
        builder.setLogin("k2777");
        builder.setPassword("5678");
        builder.setTimestamp(5L);
    }
    public void constructManualUser(Builder builder){
        builder.setLogin("bird");
        builder.setPassword("1234");
        builder.setTimestamp(98L);
    }
}

package com.example.solutions.patterns.builder.builders;

public class ManualBuilder implements Builder {

    private String login;
    private String password;
    private Long timestamp;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
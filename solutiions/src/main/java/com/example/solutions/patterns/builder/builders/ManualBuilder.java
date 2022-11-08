package com.example.solutions.patterns.builder.builders;

import com.example.solutions.patterns.builder.BuildUser;

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

    public BuildUser getBuildUser() {
        return new BuildUser(login, password, timestamp);
    }
}
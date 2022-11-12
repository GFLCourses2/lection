package com.kozlov_oleksandr.builder;

import com.kozlov_oleksandr.dto.User;

public class ManualBuilder implements Builder{
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

    public User getBuildUser() {
        return new User(login, password, timestamp);
    }

}

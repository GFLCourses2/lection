package com.example.solutions.patterns.builder;

public class BuildUser {

    private String login;
    private String password;
    private Long timestamp;

    public BuildUser(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "BuildUser{" +
                "login = '" + login + '\'' +
                ", password = '" + password + '\'' +
                ", timestamp = " + timestamp +
                '}';
    }
}
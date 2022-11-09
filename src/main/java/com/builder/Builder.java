package com.builder;

public interface Builder {
    void createLogin(String login);
    void createPassword(String password);
    void createTimestamp(Long timestamp);
}

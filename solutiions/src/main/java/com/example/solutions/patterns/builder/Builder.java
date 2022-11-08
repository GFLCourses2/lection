package com.example.solutions.patterns.builder;

/**
 * Interface Builder provides all available stages configuration product
 **/
public interface Builder {
    void setLogin(String login);

    void setPassword(String password);

    void setTimestamp(Long timestamp);
}
package com.vassbassapp.repository;

public interface PasswordRepository {
    boolean add(String password);
    boolean isExists(String password);
    void clear();
    int size();
}

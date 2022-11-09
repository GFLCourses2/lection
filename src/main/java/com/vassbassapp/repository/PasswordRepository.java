package com.vassbassapp.repository;

import java.util.Collection;

public interface PasswordRepository {
    Collection<String>getAll();
    boolean add(String password);
    boolean isExists(String password);
    void clear();
    int size();
}

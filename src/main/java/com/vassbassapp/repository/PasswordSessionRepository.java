package com.vassbassapp.repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class PasswordSessionRepository implements PasswordRepository, Serializable {
    private final Set<String> repo = new LinkedHashSet<>();

    @Override
    public Collection<String> getAll() {
        return repo;
    }

    @Override
    public boolean add(String password) {
        if (password == null) return false;
        return repo.add(password);
    }

    @Override
    public boolean isExists(String password) {
        if (password == null) return true;
        return repo.contains(password);
    }

    @Override
    public void clear() {
        repo.clear();
    }

    @Override
    public int size() {
        return repo.size();
    }
}

package com.vassbassapp.decorator;

import com.vassbassapp.repository.PasswordRepository;

import java.util.Collection;

/**
 * Realization of pattern decorator
 */
public class PasswordRepositoryDecorator implements PasswordRepository {
    private final PasswordRepository repository;

    public PasswordRepositoryDecorator(PasswordRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<String> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean add(String password) {
        return repository.add(password);
    }

    @Override
    public boolean isExists(String password) {
        return repository.isExists(password);
    }

    @Override
    public void clear() {
        repository.clear();
    }

    @Override
    public int size() {
        return repository.size();
    }
}

package com.vassbassapp.repository;

import java.util.LinkedHashSet;
import java.util.Set;

public class SimplePasswordRepository implements PasswordRepository {
    private static volatile SimplePasswordRepository instance;

    private final Set<String> repo = new LinkedHashSet<>();

    private SimplePasswordRepository(){}

    public static SimplePasswordRepository getInstance(){
        if (instance == null) {
            synchronized (SimplePasswordRepository.class){
                if (instance == null) {
                    instance = new SimplePasswordRepository();
                }
            }
        }
        return instance;
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

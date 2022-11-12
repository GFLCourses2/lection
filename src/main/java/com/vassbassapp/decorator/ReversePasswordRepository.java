package com.vassbassapp.decorator;

import com.vassbassapp.repository.PasswordRepository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Realization of pattern decorator
 */
public class ReversePasswordRepository extends PasswordRepositoryDecorator {
    public ReversePasswordRepository(PasswordRepository repository) {
        super(repository);
    }

    @Override
    public Collection<String> getAll() {
        return reverseAll(super.getAll());
    }

    @Override
    public boolean add(String password) {
        if (password == null) return false;

        return super.add(reverse(password));
    }

    @Override
    public boolean isExists(String password) {
        if (password == null) return true;

        return super.isExists(reverse(password));
    }

    private String reverse(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    private Collection<String> reverseAll(Collection<String> passwords) {
        Collection<String> rl = new ArrayList<>();
        for (String p : passwords) {
            rl.add(new StringBuilder(p).reverse().toString());
        }
        return rl;
    }
}

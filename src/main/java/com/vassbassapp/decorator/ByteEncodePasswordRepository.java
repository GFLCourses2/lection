package com.vassbassapp.decorator;

import com.vassbassapp.repository.PasswordRepository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Realization of pattern decorator
 */
public class ByteEncodePasswordRepository extends PasswordRepositoryDecorator {
    private static final int KEY = 88;

    public ByteEncodePasswordRepository(PasswordRepository repository) {
        super(repository);
    }

    @Override
    public Collection<String> getAll() {
        return decodeAll(super.getAll());
    }

    @Override
    public boolean add(String password) {
        System.out.println(encode(password));
        return super.add(encode(password));
    }

    private String encode(String password) {
        StringBuilder e = new StringBuilder();
        for (char c : password.toCharArray()) {
            e.append((char) (c ^ KEY));
        }
        return e.toString();
    }

    @Override
    public boolean isExists(String password) {
        return super.isExists(encode(password));
    }

    private Collection<String> decodeAll(Collection<String>passwords) {
        Collection<String> dl = new ArrayList<>();
        for (String p : passwords) {
            StringBuilder d = new StringBuilder();
            for (char c : p.toCharArray()) {
                d.append((char) (c ^ KEY));
            }
            dl.add(d.toString());
        }
        return dl;
    }
}

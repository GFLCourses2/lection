package com.vassbassapp.facade;

import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.service.Difficult;
import com.vassbassapp.service.PasswordGenerator;

import java.util.Collection;

/**
 * Realization of pattern Facade
 */
public class UniquePasswordGenerator implements PasswordGenerator {

    private final PasswordGenerator generator;
    private final PasswordRepository repository;

    public UniquePasswordGenerator(PasswordGenerator generator, PasswordRepository repository) {
        this.generator = generator;
        this.repository = repository;
    }

    @Override
    public String generatePassword(Difficult difficultyLevel) {
        System.out.println("Generating password with difficulty level : " + difficultyLevel);
        String password = generator.generatePassword(difficultyLevel);
        if (repository.add(password)) {
            return password;
        } else {
            return generatePassword(difficultyLevel);
        }
    }

    public Collection<String> getGeneratedPasswords() {
        return repository.getAll();
    }
}

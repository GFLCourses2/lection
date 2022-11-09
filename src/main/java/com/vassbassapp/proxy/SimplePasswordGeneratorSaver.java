package com.vassbassapp.proxy;

import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.SimplePasswordRepository;
import com.vassbassapp.service.Difficult;
import com.vassbassapp.service.PasswordGenerator;
import com.vassbassapp.service.SimplePasswordGenerator;

public class SimplePasswordGeneratorSaver implements PasswordGenerator {

    private final PasswordGenerator generator = new SimplePasswordGenerator();
    private final PasswordRepository repository = SimplePasswordRepository.getInstance();

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
}

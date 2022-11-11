package com.vassbassapp.facade;

import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.service.publisherSubscriber.MessagePublisher;
import com.vassbassapp.service.paswordGenerator.Difficult;
import com.vassbassapp.service.paswordGenerator.PasswordGenerator;
import com.vassbassapp.service.publisherSubscriber.MessageManager;
import com.vassbassapp.service.publisherSubscriber.Title;

import java.util.Collection;

/**
 * Realization of pattern Facade, Subscriber - Publisher
 */
public class UniquePasswordGenerator implements PasswordGenerator, MessagePublisher {

    private final PasswordGenerator generator;
    private final PasswordRepository repository;
    private MessageManager messageManager;

    public UniquePasswordGenerator(PasswordGenerator generator, PasswordRepository repository) {
        this.generator = generator;
        this.repository = repository;
    }

    @Override
    public String generatePassword(Difficult difficultyLevel) {
        if (messageManager != null){
            messageManager.invoke(Title.MESSAGE, "Generating password with difficulty level : " + difficultyLevel);
        }
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

    @Override
    public void setMessageManager(MessageManager manager) {
        this.messageManager = manager;
    }
}

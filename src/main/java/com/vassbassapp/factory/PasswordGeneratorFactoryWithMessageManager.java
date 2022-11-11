package com.vassbassapp.factory;

import com.vassbassapp.service.paswordGenerator.PasswordGenerator;
import com.vassbassapp.service.publisherSubscriber.MessageManager;

public interface PasswordGeneratorFactoryWithMessageManager extends PasswordGeneratorFactory {
    PasswordGenerator createSessionUniqueEnglishGenerator(MessageManager manager);
    PasswordGenerator createSessionUniqueUkraineGenerator(MessageManager manager);
    PasswordGenerator createUniqueEnglishGenerator(MessageManager manager);
    PasswordGenerator createUniqueUkraineGenerator(MessageManager manager);
}

package com.vassbassapp;

import com.vassbassapp.factory.ExtendedPasswordGeneratorFactory;
import com.vassbassapp.factory.PasswordGeneratorFactoryWithMessageManager;
import com.vassbassapp.service.paswordGenerator.Difficult;
import com.vassbassapp.service.paswordGenerator.PasswordGenerator;
import com.vassbassapp.service.publisherSubscriber.ConsoleMessageSender;
import com.vassbassapp.service.publisherSubscriber.DefaultMessageManager;
import com.vassbassapp.service.publisherSubscriber.ErrorLogMessageSender;
import com.vassbassapp.service.publisherSubscriber.Title;

public class App {
    public static void main(String[] args) {
        PasswordGeneratorFactoryWithMessageManager factory = new ExtendedPasswordGeneratorFactory();

        PasswordGenerator generator = factory.createSessionUniqueEnglishGenerator(DefaultMessageManager.getInstance());

        DefaultMessageManager.getInstance().subscribe(Title.MESSAGE, new ConsoleMessageSender());
        DefaultMessageManager.getInstance().subscribe(Title.ERROR, new ErrorLogMessageSender());

        generator.generatePassword(Difficult.EASY);
        generator.generatePassword(Difficult.MEDIUM);
        generator.generatePassword(Difficult.HARD);
    }
}

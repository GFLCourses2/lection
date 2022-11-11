package com.vassbassapp.service.paswordGenerator;

import com.vassbassapp.service.publisherSubscriber.MessagePublisher;
import com.vassbassapp.service.publisherSubscriber.MessageManager;
import com.vassbassapp.service.publisherSubscriber.Title;

import java.util.Random;

/**
 * Realization of pattern Publisher - Subscriber
 */
public class SimplePasswordGenerator implements PasswordGenerator, MessagePublisher {

    private final Locale locale;
    private MessageManager messageManager;

    public SimplePasswordGenerator() {
        locale = Locale.ENGLISH;
    }

    public SimplePasswordGenerator(Locale locale) {
        this.locale = locale;
    }

    @Override
    public void setMessageManager(MessageManager manager) {
        this.messageManager = manager;
    }

    @Override
    public String generatePassword(Difficult difficultyLevel) {
        String alphabet = locale.getAlphabet();
        Random generator = new Random();
        StringBuilder builder = new StringBuilder();

        int length = switch (difficultyLevel) {
            case EASY -> 4;
            case MEDIUM -> 8;
            case HARD -> 12;
        };

        for (int i=0;i<length;i++){
            builder.append(alphabet.charAt(generator.nextInt(0,alphabet.length())));
        }
        String password = builder.toString();
        if (messageManager != null) {
            messageManager.invoke(Title.MESSAGE, "Generated password : " + password);
        }

        return password;
    }
}

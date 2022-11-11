package com.vassbassapp.service.publisherSubscriber;

public class ConsoleMessageSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}

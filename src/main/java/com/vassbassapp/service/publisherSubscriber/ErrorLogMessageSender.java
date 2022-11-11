package com.vassbassapp.service.publisherSubscriber;

import com.vassbassapp.service.ErrorLog;

public class ErrorLogMessageSender implements MessageSender {
    private final ErrorLog log = ErrorLog.getInstance();

    @Override
    public void sendMessage(String message) {
        log.appendString(message);
    }
}

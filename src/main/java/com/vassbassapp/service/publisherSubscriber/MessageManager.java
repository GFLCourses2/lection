package com.vassbassapp.service.publisherSubscriber;

import java.util.List;

public interface MessageManager {
    List<MessageSender> getSubscribers(Title title);
    void subscribe(Title title, MessageSender subscriber);
    void unsubscribe(Title title, MessageSender subscriber);
    void invoke(Title title, String message);
}

package com.vassbassapp.service.publisherSubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Realization of pattern Publisher - Subscriber (without queue, realtime)
 * Singleton
 */
public class DefaultMessageManager implements MessageManager {
    private static volatile DefaultMessageManager instance;
    private final Map<Title, List<MessageSender>> subscribers = new HashMap<>();

    private DefaultMessageManager() {}

    public static DefaultMessageManager getInstance() {
        if (instance == null) {
            synchronized (DefaultMessageManager.class) {
                if (instance == null) {
                    instance = new DefaultMessageManager();
                }
            }
        }
        return instance;
    }

    @Override
    public List<MessageSender> getSubscribers(Title title) {
        return subscribers.computeIfAbsent(title, k -> new ArrayList<>());
    }

    @Override
    public void subscribe(Title title, MessageSender subscriber) {
        subscribers.computeIfAbsent(title, k -> new ArrayList<>()).add(subscriber);
    }

    @Override
    public void unsubscribe(Title title, MessageSender subscriber) {
        List<MessageSender> senders = subscribers.get(title);
        if (senders != null) senders.remove(subscriber);
    }

    @Override
    public void invoke(Title title, String message) {
        List<MessageSender> senders = subscribers.get(title);
        if (senders != null) senders.forEach(s -> s.sendMessage(message));
    }
}

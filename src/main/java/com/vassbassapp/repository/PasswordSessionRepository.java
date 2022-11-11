package com.vassbassapp.repository;

import com.vassbassapp.service.publisherSubscriber.MessageManager;
import com.vassbassapp.service.publisherSubscriber.MessagePublisher;
import com.vassbassapp.service.publisherSubscriber.Title;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class PasswordSessionRepository implements PasswordRepository, MessagePublisher, Serializable {
    private final Set<String> repo = new LinkedHashSet<>();
    private MessageManager messageManager;

    @Override
    public Collection<String> getAll() {
        return repo;
    }

    @Override
    public boolean add(String password) {
        if (password == null) return false;

        if (repo.add(password)) {
            if (messageManager != null) {
                messageManager.invoke(Title.MESSAGE,
                        "The password has been saved for the current session");
            }
            return true;
        } else {
            if (messageManager != null) {
                messageManager.invoke(Title.MESSAGE,
                        "The password has already been generated");
            }
            return false;
        }
    }

    @Override
    public boolean isExists(String password) {
        if (password == null) return true;
        return repo.contains(password);
    }

    @Override
    public void clear() {
        repo.clear();
    }

    @Override
    public int size() {
        return repo.size();
    }

    @Override
    public void setMessageManager(MessageManager manager) {
        messageManager = manager;
    }
}

package com.vassbassapp.IoC_DI;

import com.vassbassapp.service.publisherSubscriber.MessageManager;

public interface AbstractFactory {
    <T> T create(Class<T> clazz);
    <T> T create(Class<T> clazz, MessageManager manager);
}

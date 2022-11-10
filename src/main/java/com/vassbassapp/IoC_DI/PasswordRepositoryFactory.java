package com.vassbassapp.IoC_DI;

import com.vassbassapp.proxy.PasswordFileRepository;
import com.vassbassapp.repository.PasswordSessionRepository;

/**
 * Realization of pattern IoC DI
 */
public class PasswordRepositoryFactory implements AbstractFactory {

    @Override
    @SuppressWarnings("unchecked")
    public <T> T create(Class<T> clazz) {
        if (clazz.isAssignableFrom(PasswordSessionRepository.class)) {
            return (T) new PasswordSessionRepository();
        } else if (clazz.isAssignableFrom(PasswordFileRepository.class)) {
            return (T) PasswordFileRepository.getInstance();
        } else return null;
    }
}

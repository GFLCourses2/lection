package com.vassbassapp.factory;

import com.vassbassapp.facade.UniquePasswordGenerator;
import com.vassbassapp.proxy.PasswordFileRepository;
import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.PasswordSessionRepository;
import com.vassbassapp.service.Locale;
import com.vassbassapp.service.PasswordGenerator;
import com.vassbassapp.service.SimplePasswordGenerator;

/**
 * Realization of pattern factory
 */
public class PasswordGeneratorFactoryImpl implements PasswordGeneratorFactory {
    @Override
    public PasswordGenerator createSessionUniqueEnglishGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.ENGLISH);
        PasswordRepository repository = new PasswordSessionRepository();

        return new UniquePasswordGenerator(generator, repository);
    }

    @Override
    public PasswordGenerator createSessionUniqueUkraineGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.UKRAINE);
        PasswordRepository repository = new PasswordSessionRepository();

        return new UniquePasswordGenerator(generator, repository);
    }

    @Override
    public PasswordGenerator createUniqueEnglishGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.ENGLISH);
        PasswordRepository repository = PasswordFileRepository.getInstance();

        return new UniquePasswordGenerator(generator, repository);
    }

    @Override
    public PasswordGenerator createUniqueUkraineGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.UKRAINE);
        PasswordRepository repository = PasswordFileRepository.getInstance();

        return new UniquePasswordGenerator(generator, repository);
    }
}

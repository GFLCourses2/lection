package com.vassbassapp.factory;

import com.vassbassapp.IoC_DI.PasswordRepositoryFactory;
import com.vassbassapp.facade.UniquePasswordGenerator;
import com.vassbassapp.proxy.PasswordFileRepository;
import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.PasswordSessionRepository;
import com.vassbassapp.service.paswordGenerator.Locale;
import com.vassbassapp.service.paswordGenerator.PasswordGenerator;
import com.vassbassapp.service.paswordGenerator.SimplePasswordGenerator;

/**
 * Realization of pattern factory
 */
public class DefaultPasswordGeneratorFactory implements PasswordGeneratorFactory {
    private final PasswordRepositoryFactory repositoryFactory = new PasswordRepositoryFactory();

    @Override
    public PasswordGenerator createSessionUniqueEnglishGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.ENGLISH);
        PasswordRepository repository = repositoryFactory.create(PasswordSessionRepository.class);

        return new UniquePasswordGenerator(generator, repository);
    }

    @Override
    public PasswordGenerator createSessionUniqueUkraineGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.UKRAINE);
        PasswordRepository repository = repositoryFactory.create(PasswordSessionRepository.class);

        return new UniquePasswordGenerator(generator, repository);
    }

    @Override
    public PasswordGenerator createUniqueEnglishGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.ENGLISH);
        PasswordRepository repository = repositoryFactory.create(PasswordFileRepository.class);

        return new UniquePasswordGenerator(generator, repository);
    }

    @Override
    public PasswordGenerator createUniqueUkraineGenerator() {
        PasswordGenerator generator = new SimplePasswordGenerator(Locale.UKRAINE);
        PasswordRepository repository = repositoryFactory.create(PasswordFileRepository.class);

        return new UniquePasswordGenerator(generator, repository);
    }
}

package com.vassbassapp.factory;

import com.vassbassapp.IoC_DI.PasswordRepositoryFactory;
import com.vassbassapp.facade.UniquePasswordGenerator;
import com.vassbassapp.proxy.PasswordFileRepository;
import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.PasswordSessionRepository;
import com.vassbassapp.service.paswordGenerator.Locale;
import com.vassbassapp.service.paswordGenerator.PasswordGenerator;
import com.vassbassapp.service.paswordGenerator.SimplePasswordGenerator;
import com.vassbassapp.service.publisherSubscriber.MessageManager;

public class ExtendedPasswordGeneratorFactory
        extends DefaultPasswordGeneratorFactory
        implements PasswordGeneratorFactoryWithMessageManager {

    private final PasswordRepositoryFactory repositoryFactory = new PasswordRepositoryFactory();

    @Override
    public PasswordGenerator createSessionUniqueEnglishGenerator(MessageManager manager) {
        SimplePasswordGenerator generator = new SimplePasswordGenerator(Locale.ENGLISH);
        generator.setMessageManager(manager);
        PasswordRepository repository = repositoryFactory.create(PasswordSessionRepository.class, manager);

        UniquePasswordGenerator uniqueGenerator = new UniquePasswordGenerator(generator, repository);
        uniqueGenerator.setMessageManager(manager);
        return uniqueGenerator;
    }

    @Override
    public PasswordGenerator createSessionUniqueUkraineGenerator(MessageManager manager) {
        SimplePasswordGenerator generator = new SimplePasswordGenerator(Locale.UKRAINE);
        generator.setMessageManager(manager);
        PasswordRepository repository = repositoryFactory.create(PasswordSessionRepository.class, manager);

        UniquePasswordGenerator uniqueGenerator = new UniquePasswordGenerator(generator, repository);
        uniqueGenerator.setMessageManager(manager);
        return uniqueGenerator;
    }

    @Override
    public PasswordGenerator createUniqueEnglishGenerator(MessageManager manager) {
        SimplePasswordGenerator generator = new SimplePasswordGenerator(Locale.ENGLISH);
        generator.setMessageManager(manager);
        PasswordRepository repository = repositoryFactory.create(PasswordFileRepository.class, manager);

        UniquePasswordGenerator uniqueGenerator =  new UniquePasswordGenerator(generator, repository);
        uniqueGenerator.setMessageManager(manager);
        return uniqueGenerator;
    }

    @Override
    public PasswordGenerator createUniqueUkraineGenerator(MessageManager manager) {
        SimplePasswordGenerator generator = new SimplePasswordGenerator(Locale.UKRAINE);
        generator.setMessageManager(manager);
        PasswordRepository repository = repositoryFactory.create(PasswordFileRepository.class, manager);

        UniquePasswordGenerator uniqueGenerator = new UniquePasswordGenerator(generator, repository);
        uniqueGenerator.setMessageManager(manager);
        return uniqueGenerator;
    }
}

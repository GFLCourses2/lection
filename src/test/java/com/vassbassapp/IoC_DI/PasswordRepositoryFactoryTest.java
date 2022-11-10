package com.vassbassapp.IoC_DI;

import com.vassbassapp.dto.DTO;
import com.vassbassapp.proxy.PasswordFileRepository;
import com.vassbassapp.repository.PasswordSessionRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordRepositoryFactoryTest {
    private PasswordRepositoryFactory factory;

    @Before
    public void initFactory() {
        factory = new PasswordRepositoryFactory();
    }

    @Test
    public void testCreatePasswordSessionRepository() {
        Class<PasswordSessionRepository> expected = PasswordSessionRepository.class;
        assertTrue(expected.isAssignableFrom(factory.create(PasswordSessionRepository.class).getClass()));
    }

    @Test
    public void testCreatePasswordFileRepository() {
        Class<PasswordFileRepository> expected = PasswordFileRepository.class;
        assertTrue(expected.isAssignableFrom(factory.create(PasswordFileRepository.class).getClass()));
    }

    @Test
    public void testCreateInvalidObject() {
        assertNull(factory.create(DTO.class));
    }
}
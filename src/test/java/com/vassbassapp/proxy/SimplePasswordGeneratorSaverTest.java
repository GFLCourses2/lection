package com.vassbassapp.proxy;

import com.vassbassapp.repository.PasswordRepository;
import com.vassbassapp.repository.SimplePasswordRepository;
import com.vassbassapp.service.Difficult;
import com.vassbassapp.service.PasswordGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimplePasswordGeneratorSaverTest {

    private final PasswordGenerator generator = new SimplePasswordGeneratorSaver();
    private final PasswordRepository repository = SimplePasswordRepository.getInstance();

    @Test
    public void testGeneratePassword() {
        String easyPassword = generator.generatePassword(Difficult.EASY);
        String mediumPassword = generator.generatePassword(Difficult.MEDIUM);
        String hardPassword = generator.generatePassword(Difficult.HARD);

        assertEquals(easyPassword.length(), 4);
        assertEquals(mediumPassword.length(), 8);
        assertEquals(hardPassword.length(), 12);

        assertTrue(repository.isExists(easyPassword));
        assertTrue(repository.isExists(mediumPassword));
        assertTrue(repository.isExists(hardPassword));
    }
}
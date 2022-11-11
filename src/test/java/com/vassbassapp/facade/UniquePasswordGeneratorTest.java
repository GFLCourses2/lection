package com.vassbassapp.facade;

import com.vassbassapp.repository.PasswordSessionRepository;
import com.vassbassapp.service.paswordGenerator.Difficult;
import com.vassbassapp.service.paswordGenerator.SimplePasswordGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePasswordGeneratorTest {

    private final UniquePasswordGenerator generator = new UniquePasswordGenerator(
            new SimplePasswordGenerator(), new PasswordSessionRepository()
    );

    @Test
    public void testGeneratePassword() {
        String easyPassword = generator.generatePassword(Difficult.EASY);
        String mediumPassword = generator.generatePassword(Difficult.MEDIUM);
        String hardPassword = generator.generatePassword(Difficult.HARD);

        assertEquals(easyPassword.length(), 4);
        assertEquals(mediumPassword.length(), 8);
        assertEquals(hardPassword.length(), 12);

        assertTrue(generator.getGeneratedPasswords().contains(easyPassword));
        assertTrue(generator.getGeneratedPasswords().contains(mediumPassword));
        assertTrue(generator.getGeneratedPasswords().contains(hardPassword));
    }

    @Test
    public void testGetGeneratedPasswords() {
        String easyPassword = generator.generatePassword(Difficult.EASY);
        String mediumPassword = generator.generatePassword(Difficult.MEDIUM);
        String hardPassword = generator.generatePassword(Difficult.HARD);
        String[] expected = new String[]{easyPassword, mediumPassword, hardPassword};

        assertArrayEquals(expected, generator.getGeneratedPasswords().toArray(new String[0]));
    }
}
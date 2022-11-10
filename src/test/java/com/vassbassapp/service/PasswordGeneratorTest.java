package com.vassbassapp.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGeneratorTest {

    private PasswordGenerator passwordGenerator;

    @Before
    public void initGenerator() {
        passwordGenerator = new SimplePasswordGenerator();
    }

    @Test
    public void testGenerateEnglishPassword() {
        String easyPassword = passwordGenerator.generatePassword(Difficult.EASY);
        String mediumPassword = passwordGenerator.generatePassword(Difficult.MEDIUM);
        String hardPassword = passwordGenerator.generatePassword(Difficult.HARD);

        assertEquals(easyPassword.length(), 4);
        assertEquals(mediumPassword.length(), 8);
        assertEquals(hardPassword.length(), 12);
    }
}
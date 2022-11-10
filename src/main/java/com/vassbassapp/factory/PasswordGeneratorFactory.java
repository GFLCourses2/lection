package com.vassbassapp.factory;

import com.vassbassapp.service.PasswordGenerator;

public interface PasswordGeneratorFactory {
    PasswordGenerator createSessionUniqueEnglishGenerator();
    PasswordGenerator createSessionUniqueUkraineGenerator();
    PasswordGenerator createUniqueEnglishGenerator();
    PasswordGenerator createUniqueUkraineGenerator();
}

package com.example.solutions.patterns.proxy.service;

import java.util.Random;

public class OriginalUserService implements UserService {

    @Override
    public String getUserTemporaryPassword(String email) {
        System.out.print("User's temporary password for " + email + ": ");

        Random random = new Random();
        int partPassword = random.nextInt(1, 1_000_000);

        return email + partPassword;
    }
}
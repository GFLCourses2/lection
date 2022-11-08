package com.example.solutions.patterns.proxy.proxy;

import com.example.solutions.patterns.proxy.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceProxy implements UserService {

    private final UserService userService;
    private static final Map<String, String> CACHE = new HashMap<>();

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getUserTemporaryPassword(String email) {
        System.out.print("User's encoded temporary password for " + email + ": ");

        String encodedPassword = CACHE.get(email);
        String newEncodedPassword = "";

        if (encodedPassword == null) {
            newEncodedPassword = new StringBuilder(email).reverse().toString();
            CACHE.put(email, newEncodedPassword);
            return newEncodedPassword;
        }
        return newEncodedPassword;
    }
}
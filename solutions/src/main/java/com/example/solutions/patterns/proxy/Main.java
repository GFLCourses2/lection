package com.example.solutions.patterns.proxy;

import com.example.solutions.patterns.proxy.proxy.UserServiceProxy;
import com.example.solutions.patterns.proxy.service.OriginalUserService;
import com.example.solutions.patterns.proxy.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService originalUserService = new OriginalUserService();
        System.out.println(originalUserService.getUserTemporaryPassword("oleg1234@mail.com"));

        UserService userService1 = new UserServiceProxy(originalUserService);
        System.out.println(userService1.getUserTemporaryPassword("oleg1234@mail.com"));
    }
}
package com.slisak.lection.singleton;

import com.slisak.lection.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UsersSingleton {
    private static volatile UsersSingleton instance;

    private final List<User> users;

    private UsersSingleton() {
        users = new ArrayList<>();
    }

    public static UsersSingleton getInstance() {
        if (instance == null) {
            synchronized (UsersSingleton.class) {
                instance = new UsersSingleton();
            }
        }
        return instance;
    }

    public List<User> getUsers() {
        List<User> result = new ArrayList<>();
        users.forEach(user -> result.add(new User(user.getName(), user.getAge(), user.getEmail())));
        return result;
    }
}

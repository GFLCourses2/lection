package com.slisak.lection.builder;

import com.slisak.lection.dto.User;

public interface UserBuilder extends Builder<User> {
    UserBuilder setName(String name);
    UserBuilder setAge(int age);
    UserBuilder setEmail(String email);
}

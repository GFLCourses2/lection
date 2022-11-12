package com.slisak.lection.builder;

import com.slisak.lection.dto.User;

public class DefaultUserBuilder implements UserBuilder{
    private String name = "";

    private int age = 0;

    private String email = "";
    @Override
    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public User build() {
        return new User(name, age, email);
    }
}

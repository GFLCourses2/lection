package com.kozlov_oleksandr.factory;

public interface AbstractFactory {
    <T> T create(Class<T> clazz);
}

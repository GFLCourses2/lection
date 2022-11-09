package com.factory;

public interface AbstractFactory {
    <T> T create(Class<T> tClass);
}

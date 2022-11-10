package com.vassbassapp.IoC_DI;

public interface AbstractFactory {
    <T> T create(Class<T> clazz);
}

package com.example.solutions.patterns.factory;

public interface AbstractFactory {

    <T> T createSingleton(Class<T> clazz);
}
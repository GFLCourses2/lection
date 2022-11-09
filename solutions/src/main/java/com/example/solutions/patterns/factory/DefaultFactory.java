package com.example.solutions.patterns.factory;

import com.example.solutions.patterns.facade.singletons.AbstractFirstSingleton;
import com.example.solutions.patterns.facade.singletons.AbstractSecondSingleton;
import com.example.solutions.patterns.facade.singletons.FirstSingleton;
import com.example.solutions.patterns.facade.singletons.SecondSingleton;

public class DefaultFactory implements AbstractFactory {

    @Override
    public <T> T createSingleton(Class<T> clazz) {
        if (clazz.isAssignableFrom(AbstractFirstSingleton.class)) {
            System.out.println("Create instance FirstSingleton");
            return (T) FirstSingleton.getInstance();
        }
        if (clazz.isAssignableFrom(AbstractSecondSingleton.class)) {
            System.out.println("Create instance SecondSingleton");
            return (T) SecondSingleton.getInstance();
        }
        System.out.println("Singleton have not found!");
        return null;
    }
}
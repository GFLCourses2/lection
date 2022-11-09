package com.example.solutions.patterns.factory;

import com.example.solutions.patterns.facade.singletons.AbstractFirstSingleton;
import com.example.solutions.patterns.facade.singletons.AbstractSecondSingleton;

public class Demo {
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();

        defaultFactory.createSingleton(AbstractFirstSingleton.class);
        defaultFactory.createSingleton(AbstractSecondSingleton.class);
        defaultFactory.createSingleton(AbstractFactory.class);
    }
}
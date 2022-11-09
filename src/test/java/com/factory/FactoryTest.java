package com.factory;

import com.facade.singletons.FirstSingleton;
import com.facade.singletons.SecondSingleton;
import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    void defaultFactoryTest(){
        SingletonFactory singletonFactory = new DefaultFactory();
        FirstSingleton firstSingleton = singletonFactory.createFirstSingleton();
        firstSingleton.printAction();

        SecondSingleton secondSingleton = singletonFactory.createSecondSingleton();
        secondSingleton.printAction();
    }

    @Test
    void abstractFactoryTest(){
        AbstractFactory abstractFactory = new SimpleAbstractFactory();
        FirstSingleton firstSingleton = abstractFactory.create(FirstSingleton.class);
        SecondSingleton secondSingleton = abstractFactory.create(SecondSingleton.class);

        firstSingleton.printAction();
        secondSingleton.printAction();
    }
}

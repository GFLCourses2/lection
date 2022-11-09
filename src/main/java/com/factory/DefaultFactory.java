package com.factory;

import com.facade.singletons.FirstSingleton;
import com.facade.singletons.SecondSingleton;

public class DefaultFactory implements SingletonFactory {
    @Override
    public FirstSingleton createFirstSingleton() {
        return FirstSingleton.getInstance();
    }

    @Override
    public SecondSingleton createSecondSingleton() {
        return SecondSingleton.getInstance();
    }
}

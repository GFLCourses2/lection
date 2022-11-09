package com.factory;

import com.facade.singletons.FirstSingleton;
import com.facade.singletons.SecondSingleton;

public class SimpleAbstractFactory implements AbstractFactory {
    @Override
    public <T> T create(Class<T> tClass) {
        if (tClass.isAssignableFrom(FirstSingleton.class)) {
            return (T) FirstSingleton.getInstance();
        } else if (tClass.isAssignableFrom(SecondSingleton.class)) {
            return (T) SecondSingleton.getInstance();
        } return null;
    }
}

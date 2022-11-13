package com.kozlov_oleksandr.factory;

import com.kozlov_oleksandr.facade.FirstSingleton;
import com.kozlov_oleksandr.facade.SecondSingleton;
import com.kozlov_oleksandr.facade.ThirdSingleton;

public class Factory implements AbstractFactory{
    @Override
    public <T> T create(Class<T> clazz) {
        if(clazz.isAssignableFrom(FirstSingleton.class))
            return (T) FirstSingleton.getInstance();
        if(clazz.isAssignableFrom(SecondSingleton.class))
            return (T) SecondSingleton.getInstance();
        if(clazz.isAssignableFrom(ThirdSingleton.class))
            return (T) ThirdSingleton.getInstance();
        return null;
    }
}

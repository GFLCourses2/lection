package com.facade;

import com.facade.singletons.FirstSingleton;
import com.facade.singletons.SecondSingleton;
import com.factory.AbstractFactory;

public class SingletonsFacade implements Facade{
    private FirstSingleton firstSingleton;
    private SecondSingleton secondSingleton;
    
    public SingletonsFacade(FirstSingleton firstSingleton, SecondSingleton secondSingleton) {
        this.firstSingleton = firstSingleton;
        this.secondSingleton = secondSingleton;
    }

    @Override
    public void callActions() {
        firstSingleton.printAction();
        secondSingleton.printAction();
    }
}

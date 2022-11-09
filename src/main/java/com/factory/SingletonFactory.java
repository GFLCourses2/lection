package com.factory;

import com.facade.singletons.FirstSingleton;
import com.facade.singletons.SecondSingleton;

public interface SingletonFactory {
    FirstSingleton createFirstSingleton();
    SecondSingleton createSecondSingleton();
}

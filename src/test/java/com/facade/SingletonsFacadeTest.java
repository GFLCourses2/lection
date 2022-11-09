package com.facade;

import com.facade.SingletonsFacade;
import com.facade.singletons.FirstSingleton;
import com.facade.singletons.SecondSingleton;
import org.junit.jupiter.api.Test;

class SingletonsFacadeTest {
    @Test
    void singletonsActions(){
        SingletonsFacade singletonsFacade = new SingletonsFacade(FirstSingleton.getInstance(), SecondSingleton.getInstance());
        singletonsFacade.callActions();
    }
}
package test.java.com.facade;

import main.java.com.facade.SingletonsFacade;
import main.java.com.facade.singletons.FirstSingleton;
import main.java.com.facade.singletons.SecondSingleton;
import org.junit.jupiter.api.Test;

class SingletonsFacadeTest {
    @Test
    void singletonsActions(){
        SingletonsFacade singletonsFacade = new SingletonsFacade(FirstSingleton.getInstance(), SecondSingleton.getInstance());
        singletonsFacade.callActions();
    }
}
package main.java.com.facade;

import main.java.com.facade.singletons.FirstSingleton;
import main.java.com.facade.singletons.SecondSingleton;

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

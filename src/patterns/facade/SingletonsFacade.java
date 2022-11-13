package patterns.facade;

import patterns.facade.singlentons.FirstSingleton;
import patterns.facade.singlentons.SecondSingleton;
import patterns.facade.singlentons.ThirdSingleton;

public class SingletonsFacade implements Facade {
    private FirstSingleton firstSingleton;
    private SecondSingleton secondSingleton;
    private ThirdSingleton thirdSingleton;

    public SingletonsFacade() {
        firstSingleton = FirstSingleton.getInstance();
        secondSingleton = SecondSingleton.getInstance();
        thirdSingleton = ThirdSingleton.getInstance();
    }
    @Override
    public void call() {
        firstSingleton.doAction();
        secondSingleton.doAction();
        thirdSingleton.doAction();
    }
}

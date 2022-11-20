package patterns.factory;

import patterns.facade.singlentons.FirstSingleton;
import patterns.facade.singlentons.SecondSingleton;

public class SingletonFactory implements AbstractFactory {
    @Override
    public <T> T create(Class<T> clazz) {
        if (clazz.isAssignableFrom(FirstSingleton.class)) {
            return (T) FirstSingleton.getInstance();
        } else if (clazz.isAssignableFrom(SecondSingleton.class)) {
            return (T) SecondSingleton.getInstance();
        }
        return null;
    }
}

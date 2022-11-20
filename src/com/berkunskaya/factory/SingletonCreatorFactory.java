package src.src.com.berkunskaya.factory;
/*
Factory should create one of two Singletons.
Parameter of factory method is a class -
interface that is implemented by Singleton.
 */
public class SingletonCreatorFactory implements AbstractFactory{
    @Override
    public <T> T create(Class<T> clazz) {
        if(clazz.isAssignableFrom(SingletonOne.class))
            return (T) SingletonOne.getINSTANCE();
        if(clazz.isAssignableFrom(SingletonTwo.class))
            return (T) SingletonTwo.getINSTANCE();
        return null;
    }
}

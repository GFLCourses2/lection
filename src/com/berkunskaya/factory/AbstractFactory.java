package src.src.com.berkunskaya.factory;

public interface AbstractFactory {
    <T> T create(Class<T> clazz);
}

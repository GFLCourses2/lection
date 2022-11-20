package patterns.factory;

public interface AbstractFactory {
    <T> T create(Class<T> clazz);
}

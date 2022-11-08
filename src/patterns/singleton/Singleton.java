package patterns.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null)
                instance = new Singleton();
            }
        }
        return instance;
    }
}

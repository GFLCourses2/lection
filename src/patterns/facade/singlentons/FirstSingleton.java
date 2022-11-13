package patterns.facade.singlentons;

public class FirstSingleton implements ActionSingleton {
    private static FirstSingleton instance;
    private FirstSingleton() {}
    public static FirstSingleton getInstance() {
        if (instance == null) {
            synchronized (FirstSingleton.class) {
                if (instance == null)
                instance = new FirstSingleton();
            }
        }
        return instance;
    }
    @Override
    public void doAction() {
        System.out.println("Action 1");
    }
}

package patterns.facade.singlentons;

public class SecondSingleton implements ActionSingleton {
    private static SecondSingleton instance;
    private SecondSingleton() {}
    public static SecondSingleton getInstance() {
        if (instance == null) {
            synchronized (SecondSingleton.class) {
                if (instance == null)
                instance = new SecondSingleton();
            }
        }
        return instance;
    }
    @Override
    public void doAction() {
        System.out.println("Action 2");
    }
}

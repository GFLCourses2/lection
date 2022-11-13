package patterns.facade.singlentons;

public class ThirdSingleton implements ActionSingleton {
    private static ThirdSingleton instance;
    private ThirdSingleton() {
    }
    public static ThirdSingleton getInstance() {
        if (instance == null)
            synchronized (ThirdSingleton.class) {
                if (instance == null)
                    instance = new ThirdSingleton();
            }
        return instance;
    }
    @Override
    public void doAction() {
        System.out.println("Action 3");
    }
}

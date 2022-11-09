package main.java.com.facade.singletons;


public class SecondSingleton {
    private static volatile SecondSingleton instance;

    public static SecondSingleton getInstance() {
        if (instance == null){
            synchronized (SecondSingleton.class){
                instance = new SecondSingleton();
            }
        }
        return instance;
    }

    public void printAction(){
        System.out.println("Action of second singleton");
    }
}

package main.java.com.facade.singletons;

public class FirstSingleton {
    private static volatile FirstSingleton instance;

    public static FirstSingleton  getInstance() {
        if (instance == null){
            synchronized (FirstSingleton .class){
                instance = new FirstSingleton();
            }
        }
        return instance;
    }

    public void printAction(){
        System.out.println("Action of first singleton");
    }
}

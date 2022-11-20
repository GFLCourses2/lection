package src.src.com.berkunskaya.service;

//Singleton with Lazy Initialization
public class SingletonServiceTwo implements SingletonService {
    private static SingletonServiceTwo INSTANCE;

    private SingletonServiceTwo(){

    }

    public static SingletonServiceTwo getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new SingletonServiceTwo();
        }
        return INSTANCE;
    }

    @Override
    public void writeToConsole(){
        System.out.println("Action 2");
    }
}

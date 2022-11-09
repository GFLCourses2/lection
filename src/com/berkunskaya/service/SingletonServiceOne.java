package src.src.com.berkunskaya.service;

//Singleton with Lazy Initialization
public class SingletonServiceOne implements SingletonService {
    private static SingletonServiceOne INSTANCE;

    private SingletonServiceOne(){

    }

    public static SingletonServiceOne getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new SingletonServiceOne();
        }
        return INSTANCE;
    }


    @Override
    public void writeToConsole(){
        System.out.println("Action 1");
    }
}

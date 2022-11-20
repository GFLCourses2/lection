package src.src.com.berkunskaya.factory;

//Singleton with Lazy Initialization
public class SingletonOne {
    private static SingletonOne INSTANCE;

    private SingletonOne(){

    }

    public static SingletonOne getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new SingletonOne();
        }
        return INSTANCE;
    }
}

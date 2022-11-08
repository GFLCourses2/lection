package src.src.com.berkunskaya.singleton;

//Singleton with Lazy Initialization
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){

    }

    public static Singleton getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

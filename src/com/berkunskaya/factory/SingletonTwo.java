package src.src.com.berkunskaya.factory;

//Singleton with Lazy Initialization
public class SingletonTwo {
    private static SingletonTwo INSTANCE;

    private SingletonTwo(){

    }

    public static SingletonTwo getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new SingletonTwo();
        }
        return INSTANCE;
    }
}

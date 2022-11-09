package com.singleton;

public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}

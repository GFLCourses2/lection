package com.vassbassapp.facade;

public class FourthString implements ConsolePrinter {
    private static volatile FourthString instance;

    private FourthString(){}

    public static FourthString getInstance(){
        if (instance == null) {
            synchronized (FourthString.class){
                if (instance == null) {
                    instance = new FourthString();
                }
            }
        }
        return instance;
    }


    @Override
    public void print() {
        System.out.println("Вот последняя правда, открытая мной.");
    }
}

package com.vassbassapp.facade;

public class FirstString implements ConsolePrinter {
    private static volatile FirstString instance;

    private FirstString(){}

    public static FirstString getInstance(){
        if (instance == null) {
            synchronized (FirstString.class){
                if (instance == null) {
                    instance = new FirstString();
                }
            }
        }
        return instance;
    }


    @Override
    public void print() {
        System.out.println("Много лет размышлял я над жизнью земной.");
    }
}

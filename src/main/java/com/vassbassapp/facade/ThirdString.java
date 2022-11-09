package com.vassbassapp.facade;

public class ThirdString implements ConsolePrinter {
    private static volatile ThirdString instance;

    private ThirdString(){}

    public static ThirdString getInstance(){
        if (instance == null) {
            synchronized (ThirdString.class){
                if (instance == null) {
                    instance = new ThirdString();
                }
            }
        }
        return instance;
    }


    @Override
    public void print() {
        System.out.println("Мне известно, что мне ничего не известно! —");
    }
}

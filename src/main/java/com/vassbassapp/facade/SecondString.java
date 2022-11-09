package com.vassbassapp.facade;

public class SecondString implements ConsolePrinter {
    private static volatile SecondString instance;

    private SecondString(){}

    public static SecondString getInstance(){
        if (instance == null) {
            synchronized (SecondString.class){
                if (instance == null) {
                    instance = new SecondString();
                }
            }
        }
        return instance;
    }


    @Override
    public void print() {
        System.out.println("Непонятного нет для меня под луной.");
    }
}

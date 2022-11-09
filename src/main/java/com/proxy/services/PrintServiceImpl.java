package com.proxy.services;

public class PrintServiceImpl implements PrintService {
    public PrintServiceImpl() {
        init();
    }

    @Override
    public void printName(String name) {
        System.out.println("Name: " + name);
    }
    private void init(){
        System.out.println("Initialization object");
    }
}

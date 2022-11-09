package com.example.solutions.patterns.facade;

public class Main {
    public static void main(String[] args) {
        SingletonFacade facade = new SingletonFacade();
        facade.showAllSingletons();
    }
}
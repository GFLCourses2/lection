package com.kozlov_oleksandr.facade;

public class FirstSingleton implements AbstractFirstSingleton {
    private static FirstSingleton firstSingleton;

    private FirstSingleton() {
    }
    public static FirstSingleton getInstance() {
        System.out.println("Action 1");
        if (firstSingleton == null) {
            firstSingleton = new FirstSingleton();
            return firstSingleton;
        }
        return firstSingleton;
    }
}

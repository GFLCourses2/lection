package com.kozlov_oleksandr.facade;

public class SecondSingleton implements AbstractSecondSingleton {
    private static SecondSingleton secondSingletons;

    private SecondSingleton() {
    }

    public static SecondSingleton getInstance() {
        System.out.println("Action 2");
        if (secondSingletons == null) {
            secondSingletons = new SecondSingleton();
            return secondSingletons;
        }
        return secondSingletons;
    }
}

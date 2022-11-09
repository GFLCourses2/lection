package com.example.solutions.patterns.facade.singletons;

public class ThirdSingleton {

    private static ThirdSingleton thirdSingleton;

    private ThirdSingleton() {

    }

    public static ThirdSingleton getInstance() {
        System.out.println("Action 3");
        if (thirdSingleton == null) {
            thirdSingleton = new ThirdSingleton();
            return thirdSingleton;
        }
        return thirdSingleton;
    }
}

package com.example.solutions.patterns.facade;

import com.example.solutions.patterns.facade.singletons.FirstSingleton;
import com.example.solutions.patterns.facade.singletons.SecondSingleton;
import com.example.solutions.patterns.facade.singletons.ThirdSingleton;

public class SingletonFacade implements SingletonService {

    public void showAllSingletons() {
        System.out.println("Show all singletons:");
        FirstSingleton.getInstance();
        SecondSingleton.getInstance();
        ThirdSingleton.getInstance();
    }
}
package src.src.com.berkunskaya.facade;

import src.src.com.berkunskaya.service.SingletonServiceOne;
import src.src.com.berkunskaya.service.SingletonServiceTwo;

/*
Create several Sinlgleton and call him in the current facade.
Every Sinlgleton write in the console
System.out.println("Action 1"), System.out.println("Action 2") etc.
 */
public class SingletonServiceFacade {
    private final SingletonServiceOne serviceOne;
    private final SingletonServiceTwo serviceTwo;

    public SingletonServiceFacade(SingletonServiceOne serviceOne, SingletonServiceTwo serviceTwo) {
        this.serviceOne = serviceOne;
        this.serviceTwo = serviceTwo;
    }


    public void writeServiceOne() {
        serviceOne.writeToConsole();
    }
    public void writeServiceTwo() {
        serviceTwo.writeToConsole();
    }
}

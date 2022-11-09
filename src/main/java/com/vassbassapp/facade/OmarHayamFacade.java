package com.vassbassapp.facade;

public class OmarHayamFacade implements ConsolePrinter {
    private final FirstString firstString = FirstString.getInstance();
    private final SecondString secondString = SecondString.getInstance();
    private final ThirdString thirdString = ThirdString.getInstance();
    private final FourthString fourthString = FourthString.getInstance();

    @Override
    public void print() {
        firstString.print();
        secondString.print();
        thirdString.print();
        fourthString.print();
    }
}

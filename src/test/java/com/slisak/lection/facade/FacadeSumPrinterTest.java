package com.slisak.lection.facade;

import com.slisak.lection.facade.service.Adder;
import com.slisak.lection.facade.service.AdderImpl;
import com.slisak.lection.facade.service.Printer;
import com.slisak.lection.facade.service.PrinterImpl;
import org.junit.Before;
import org.junit.Test;

public class FacadeSumPrinterTest {

    SumPrinter sumPrinter;

    @Before
    public void setUp() {
        Adder adder = new AdderImpl();
        Printer printer = new PrinterImpl();
        sumPrinter = new FacadeSumPrinter(adder, printer);
    }
    @Test
    public void printSum() {
        sumPrinter.printSum(1, 2);
        sumPrinter.printSum(0, 0);
    }
}
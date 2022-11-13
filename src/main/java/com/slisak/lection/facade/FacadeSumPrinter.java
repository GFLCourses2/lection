package com.slisak.lection.facade;

import com.slisak.lection.facade.service.Adder;
import com.slisak.lection.facade.service.Printer;

public class FacadeSumPrinter implements SumPrinter {

    private final Adder adder;
    private final Printer printer;

    public FacadeSumPrinter(Adder adder, Printer printer) {
        this.adder = adder;
        this.printer = printer;
    }

    @Override
    public void printSum(int a, int b) {
        int sum = adder.add(a, b);

        printer.print(sum);
    }
}

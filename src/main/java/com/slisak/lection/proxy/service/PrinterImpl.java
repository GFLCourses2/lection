package com.slisak.lection.proxy.service;

public class PrinterImpl implements Printer {

    public PrinterImpl() {
        System.out.println("Doing some heavy initialization");
    }

    @Override
    public void print(String toPrint) {
        System.out.println(toPrint);
    }
}

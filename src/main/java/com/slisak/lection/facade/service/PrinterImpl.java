package com.slisak.lection.facade.service;

public class PrinterImpl implements Printer {
    @Override
    public void print(int a) {
        System.out.println(a);
    }
}

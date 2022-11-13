package com.slisak.lection.proxy;

import com.slisak.lection.proxy.service.Printer;
import com.slisak.lection.proxy.service.PrinterImpl;

/**
 * Lazy init proxy
 */
public class PrinterProxy implements Printer{
    private static Printer printer;

    @Override
    public void print(String toPrint) {
        if (printer == null)
            printer = new PrinterImpl();
        printer.print(toPrint);
    }
}

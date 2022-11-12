package com.slisak.lection.proxy;

import com.slisak.lection.proxy.service.Printer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterProxyTest {

    Printer printer;

    @Test
    public void print() {
        printer = new PrinterProxy();
        System.out.println("Created, but not initialized");
        printer.print("123");
    }
}
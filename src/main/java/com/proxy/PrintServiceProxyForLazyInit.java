package com.proxy;

import com.proxy.services.PrintService;
import com.proxy.services.PrintServiceImpl;

public class PrintServiceProxyForLazyInit implements PrintService {
    private PrintService printService;


    @Override
    public void printName(String name) {
        System.out.println("Proxy (for lazy init) used");
        if (printService == null){
            printService = new PrintServiceImpl();
        }
        printService.printName(name);
    }
}

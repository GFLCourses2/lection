package com.proxy;

import org.junit.jupiter.api.Test;

class PrintServiceProxyTest {

    @Test
    void testProxyForLazyInit(){
        PrintServiceProxyForLazyInit proxy = new PrintServiceProxyForLazyInit();
        proxy.printName("Oleg");
        proxy.printName("Alex");
    }
}
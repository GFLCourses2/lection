package com.vassbassapp.singleton;

import static org.junit.Assert.*;

import org.junit.*;

public class SingletonTest {
    
    @Test
    public void testGetInstance() {
        Singleton expected = Singleton.getInstance();

        assertSame(expected, Singleton.getInstance());
    }
}

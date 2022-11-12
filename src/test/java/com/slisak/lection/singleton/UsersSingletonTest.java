package com.slisak.lection.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersSingletonTest {

    @Test
    public void getInstance() {
        assertEquals(UsersSingleton.getInstance(), UsersSingleton.getInstance());
        assertSame(UsersSingleton.getInstance(), UsersSingleton.getInstance());
        assertSame(UsersSingleton.getInstance(), UsersSingleton.getInstance());
    }

    @Test
    public void getUsers() {
        assertEquals(UsersSingleton.getInstance().getUsers(), UsersSingleton.getInstance().getUsers());
        assertNotSame(UsersSingleton.getInstance().getUsers(), UsersSingleton.getInstance().getUsers());
    }
}
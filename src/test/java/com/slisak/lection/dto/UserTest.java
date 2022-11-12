package com.slisak.lection.dto;

import static org.junit.Assert.*;

public class UserTest {
    private User user;

    @org.junit.Before
    public void setUp() {
        user = new User("Alex", 22, "alex@gmail.com");
    }

    @org.junit.Test
    public void testEquals() {
        User user1 = new User("Alex", 22, "alex@gmail.com");
        assertEquals(user, user1);

        user1 = new User("Alex", 23, "alex@gmail.com");
        assertNotEquals(user, user1);

        user1 = new User("Alex", 22, "alex1@gmail.com");
        assertNotEquals(user, user1);

        user1 = new User("w", 22, "alex@gmail.com");
        assertNotEquals(user, user1);

        assertNotEquals(user, null);
    }

    @org.junit.Test
    public void testHashCode() {
        User user1 = new User("Alex", 22, "alex@gmail.com");
        assertEquals(user, user1);
        assertEquals(user.hashCode(), user1.hashCode());

        user = new User("123", 11, "123@gmail.com");
        user1 = new User("123", 11, "123@gmail.com");
        assertEquals(user, user1);
        assertEquals(user.hashCode(), user1.hashCode());


    }

    @org.junit.Test
    public void testToString() {
        assertEquals(user.toString(), "User{name='Alex', age=22, email='alex@gmail.com'}");
    }
}
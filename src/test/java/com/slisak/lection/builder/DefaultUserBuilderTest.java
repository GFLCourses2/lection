package com.slisak.lection.builder;

import com.slisak.lection.dto.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultUserBuilderTest {
    private UserBuilder builder;

    @Before
    public void setUp() {
        builder = new DefaultUserBuilder();
    }

    @Test
    public void setName() {
        builder.setName("name");
        User user = builder.build();
        assertEquals("name", user.getName());
        assertEquals(0, user.getAge());
        assertEquals("", user.getEmail());
    }

    @Test
    public void setAge() {
        builder.setAge(18);
        User user = builder.build();
        assertEquals("", user.getName());
        assertEquals(18, user.getAge());
        assertEquals("", user.getEmail());
    }

    @Test
    public void setEmail() {
        builder.setEmail("email");
        User user = builder.build();
        assertEquals("", user.getName());
        assertEquals(0, user.getAge());
        assertEquals("email", user.getEmail());
    }

    @Test
    public void all() {
        builder.setName("Steve");
        builder.setAge(22);
        builder.setEmail("steve@gmail.com");
        User user = builder.build();
        User user1 = new User("Steve", 22, "steve@gmail.com");
        assertEquals(user1, user);
    }
}
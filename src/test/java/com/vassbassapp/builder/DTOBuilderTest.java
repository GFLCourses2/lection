package com.vassbassapp.builder;

import static org.junit.Assert.*;

import org.junit.*;

import com.vassbassapp.dto.DTO;

public class DTOBuilderTest {

    private DTOBuilder builder;
    
    @Before
    public void setBuilder(){
        this.builder = new DefaultDTOBuilder();
    }

    @Test
    public void testBuildDTO(){
        String login = "login";
        String password = "password";
        Long timestamp = 3L;

        DTO expected = new DTO(login, password, timestamp);

        builder.setLogin(login);
        builder.setPassword(password);
        builder.setTimestamp(timestamp);

        assertEquals(expected, builder.build());
    }
}

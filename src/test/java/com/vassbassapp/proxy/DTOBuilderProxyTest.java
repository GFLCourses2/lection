package com.vassbassapp.proxy;

import com.vassbassapp.builder.DTOBuilder;
import com.vassbassapp.builder.DefaultDTOBuilder;
import com.vassbassapp.dto.DTO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DTOBuilderProxyTest {
    private DTOBuilder builder;

    @Before
    public void setBuilder(){
        this.builder = new DTOBuilderProxy(new DefaultDTOBuilder());
    }

    @Test
    public void testBuildDTO(){
        String login = "login";
        String password = "1111";
        Long timestamp = 3L;

        DTO expected = new DTO();
        expected.setLogin(login);
        expected.setPassword(password);
        expected.setTimestamp(timestamp);

        builder.setLogin(login)
                .setPassword(null)
                .setTimestamp(timestamp);

        assertEquals(expected, builder.build());
    }
}
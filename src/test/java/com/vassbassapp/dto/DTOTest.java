package com.vassbassapp.dto;

import static org.junit.Assert.*;

import org.junit.*;

public class DTOTest {

    @Test
    public void testEqualsAndHashCode_dtoEquals(){
        DTO dto1 = new DTO();
        dto1.setLogin("login");
        dto1.setPassword("password");
        dto1.setTimestamp(1L);

        DTO dto2 = new DTO();
        dto2.setLogin("login");
        dto2.setPassword("password");
        dto2.setTimestamp(1L);

        assertEquals(dto1, dto2);
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_dtoSame(){
        DTO dto1 = new DTO();
        dto1.setLogin("login");
        dto1.setPassword("password");
        dto1.setTimestamp(1L);

        DTO dto2 = dto1;

        assertEquals(dto1, dto2);
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_dtoNotEquals(){
        DTO dto1 = new DTO();
        dto1.setLogin("login");
        dto1.setPassword("password");
        dto1.setTimestamp(1L);

        DTO dto2 = new DTO();

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }
    
    @Test
    public void testEqualsAndHashCode_differentLogins(){
        DTO dto1 = new DTO();
        dto1.setLogin("login");
        dto1.setPassword("password");
        dto1.setTimestamp(1L);

        DTO dto2 = new DTO();
        dto2.setLogin(null);
        dto2.setPassword("password");
        dto2.setTimestamp(1L);

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_differentPasswords(){
        DTO dto1 = new DTO();
        dto1.setLogin("login");
        dto1.setPassword("password");
        dto1.setTimestamp(1L);

        DTO dto2 = new DTO();
        dto2.setLogin("login");
        dto2.setPassword(null);
        dto2.setTimestamp(1L);

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_differentTimestamp(){
        DTO dto1 = new DTO();
        dto1.setLogin("login");
        dto1.setPassword("password");
        dto1.setTimestamp(1L);

        DTO dto2 = new DTO();
        dto2.setLogin("login");
        dto2.setPassword("password");
        dto2.setTimestamp(null);

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testToString() {
        String expected = "DTO{login=login, password=password, timestamp=null}";
        DTO dto = new DTO();
        dto.setLogin("login");
        dto.setPassword("password");
        dto.setTimestamp(null);

        assertEquals(expected, dto.toString());
    }
}

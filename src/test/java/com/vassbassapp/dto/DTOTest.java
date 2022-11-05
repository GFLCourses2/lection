package com.vassbassapp.dto;

import static org.junit.Assert.*;

import org.junit.*;

public class DTOTest {

    @Test
    public void testEqualsAndHashCode_dtoEquals(){
        DTO dto1 = new DTO("login", "password", 1L);
        DTO dto2 = new DTO("login", "password", 1L);

        assertEquals(dto1, dto2);
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_dtoSame(){
        DTO dto1 = new DTO("login", "password", 1L);
        DTO dto2 = dto1;

        assertEquals(dto1, dto2);
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_dtoNotEquals(){
        DTO dto1 = new DTO("login", "password", 1L);
        DTO dto2 = new DTO();

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }
    
    @Test
    public void testEqualsAndHashCode_differentLogins(){
        DTO dto1 = new DTO("login", "password", 1L);
        DTO dto2 = new DTO(null, "password", 1L);

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_differentPasswords(){
        DTO dto1 = new DTO("login", "password", 1L);
        DTO dto2 = new DTO("login", null, 1L);

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testEqualsAndHashCode_differentTimestamp(){
        DTO dto1 = new DTO("login", "password", 1L);
        DTO dto2 = new DTO("login", "password", null);

        assertNotEquals(dto1, dto2);
        assertNotEquals(dto1.hashCode(), dto2.hashCode());
    }

    @Test
    public void testToString() {
        String expected = "DTO{login=login, password=password, timestamp=null}";
        DTO dto = new DTO("login", "password", null);

        assertEquals(expected, dto.toString());
    }
}

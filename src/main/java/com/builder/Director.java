package main.java.com.builder;

import main.java.com.dto.DTO;

public class Director {
    public  void createDTO(Builder builder){
        builder.createLogin("TestLogin");
        builder.createPassword("TestPassword");
        builder.createTimestamp(1234L);
    }
}

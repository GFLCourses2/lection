package com.vassbassapp.builder;

import com.vassbassapp.dto.DTO;

public class DefaultDTOBuilder implements DTOBuilder {
    private String login = "unknown";
    private String password = "1111";
    private Long timestamp = 1L;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public DTO build(){
        return new DTO(login, password, timestamp);
    }
    
}

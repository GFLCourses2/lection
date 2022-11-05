package com.vassbassapp.builder;

import com.vassbassapp.dto.DTO;

public class DefaultDTOBuilder implements DTOBuilder {
    private String login = "unknown";
    private String password = "1111";
    private Long timestamp = 1L;

    @Override
    public Builder setLogin(String login) {
        this.login = login;
        return this;
    }

    @Override
    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Builder setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public DTO build(){
        DTO dto = new DTO();
        dto.setLogin(login);
        dto.setPassword(password);
        dto.setTimestamp(timestamp);
        return dto;
    }
    
}

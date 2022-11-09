package com.vassbassapp.builder;

import com.vassbassapp.dto.DTO;

public interface DTOBuilder extends Builder<DTO> {
    DTOBuilder setLogin(String login);
    DTOBuilder setPassword(String password);
    DTOBuilder setTimestamp(Long timestamp);
}

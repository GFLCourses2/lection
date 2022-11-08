package com.vassbassapp.proxy;

import com.vassbassapp.builder.Builder;
import com.vassbassapp.builder.DTOBuilder;
import com.vassbassapp.dto.DTO;

public class DTOBuilderProxy implements DTOBuilder {
    private final DTOBuilder builder;

    public DTOBuilderProxy(DTOBuilder builder) {
        this.builder = builder;
    }

    @Override
    public Builder setLogin(String login) {
        if (login == null) {
            System.out.println("User login must be non null!");
        }else {
            builder.setLogin(login);
            System.out.println("User login set like = \"" + login + "\"");
        }
        return this;
    }

    @Override
    public Builder setPassword(String password) {
        if (password == null) {
            System.out.println("User password must be non null!");
        }else {
            builder.setPassword(password);
            System.out.println("User password set like = \"" + password + "\"");
        }
        return this;
    }

    @Override
    public Builder setTimestamp(Long timestamp) {
        if (timestamp == null) {
            System.out.println("User timestamp must be non null!");
        }else {
            builder.setTimestamp(timestamp);
            System.out.println("User timestamp set like = \"" + timestamp + "\"");
        }
        return this;
    }

    @Override
    public DTO build() {
        DTO dto = builder.build();
        System.out.println("DTO was built:");
        System.out.println(dto);
        return dto;
    }
}

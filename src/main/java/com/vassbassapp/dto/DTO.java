package com.vassbassapp.dto;

import java.util.Objects;

/**
 * Realization of pattern DTO
 */
public class DTO {

    private String login;
    private String password;
    private Long timestamp;

    public DTO(){}

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;

        DTO dto = (DTO)obj;
        return login.equals(dto.getLogin()) &&
                password.equals(dto.getPassword()) &&
                timestamp.equals(dto.getTimestamp()); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, timestamp);
    }

    @Override
    public String toString() {
        return "DTO{" +
                "login=" + login +  
                ", password=" + password + 
                ", timestamp=" + timestamp +
                "}";

    }
}

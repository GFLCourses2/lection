package main.java.com.builder;

import main.java.com.dto.DTO;

public class DTOBuilder implements Builder {
    private String login;
    private String password;
    private Long timestamp;

    @Override
    public void createLogin(String login) {
        this.login = login;
    }

    @Override
    public void createPassword(String password) {
        this.password = password;
    }

    @Override
    public void createTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public DTO buildDTO(){
        return new DTO(login,password,timestamp);
    }
}
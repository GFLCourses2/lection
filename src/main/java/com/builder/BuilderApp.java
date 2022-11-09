package main.java.com.builder;

import main.java.com.dto.DTO;

public class BuilderApp {
    public static void main(String[] args) {
        DTOBuilder builder = new DTOBuilder();
        Director director = new Director();

        director.createDTO(builder);
        DTO dto = builder.buildDTO();

        System.out.println(dto);
    }
}

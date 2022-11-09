package test.java.com.builder;

import main.java.com.builder.DTOBuilder;
import main.java.com.builder.Director;
import main.java.com.dto.DTO;
import org.junit.jupiter.api.Test;


class DTOBuilderTest {

    @Test
    void testBuilder(){
        DTOBuilder builder = new DTOBuilder();
        Director director = new Director();

        director.createDTO(builder);
        DTO dto = builder.buildDTO();

        System.out.println(dto);
    }
}
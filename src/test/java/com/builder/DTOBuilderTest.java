package com.builder;

import com.dto.DTO;
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
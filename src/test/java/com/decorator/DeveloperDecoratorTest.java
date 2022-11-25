package com.decorator;

import org.junit.jupiter.api.Test;

class DeveloperDecoratorTest {
    @Test
    void writeCode(){
        Developer juniorJavaDeveloper = new JuniorJavaDeveloper(new JavaDeveloper());
        Developer middleJavaDeveloper = new MiddleJavaDeveloper(new JavaDeveloper());
        System.out.println(juniorJavaDeveloper.writeCode());
        System.out.println(middleJavaDeveloper.writeCode());
    }
}
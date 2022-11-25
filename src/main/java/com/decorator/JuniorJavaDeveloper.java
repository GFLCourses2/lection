package com.decorator;

public class JuniorJavaDeveloper extends DeveloperDecorator {
    public JuniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String juniorCode(){
        return " on junior level";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + juniorCode();
    }
}

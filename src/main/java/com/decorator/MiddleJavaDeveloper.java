package com.decorator;

public class MiddleJavaDeveloper extends DeveloperDecorator {
    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String middleCode(){
        return " on middle level";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + middleCode();
    }
}

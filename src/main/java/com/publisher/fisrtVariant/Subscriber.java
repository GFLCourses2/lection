package com.publisher.fisrtVariant;

import java.util.List;

public class Subscriber {
    private String name;
    private String language;

    public Subscriber(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    void vacancyNotification(List<String> vacancies){
        System.out.println("Message for subscriber " +  name + " changed vacancies " + language + ":\n" + vacancies.toString());
    }
}

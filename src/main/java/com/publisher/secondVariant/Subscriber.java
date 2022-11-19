package com.publisher.secondVariant;

import java.util.List;
import java.util.Objects;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscriber that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }

    public void vacancyNotification(List<String> vacancies){
        System.out.println("Message for subscriber " +  name + " changed vacancies:\n" + vacancies.toString());
    }
}

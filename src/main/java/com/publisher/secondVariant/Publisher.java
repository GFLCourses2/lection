package com.publisher.secondVariant;

public interface Publisher {
    void addVacancy(String vacancy);
    void removeVacancy(String vacancy);
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
}

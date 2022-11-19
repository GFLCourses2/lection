package com.publisher.fisrtVariant;

import java.util.List;

public abstract class Publisher {
    protected List<Subscriber> subscribers;
    protected List<String> vacancies;

    abstract void subscribe(Subscriber subscriber);
    abstract void unsubscribe(Subscriber subscriber);
    abstract void notifySubscribers();
    abstract void addVacancies(List<String> vacancies);
    abstract void removeVacancy(String vacancy);
}

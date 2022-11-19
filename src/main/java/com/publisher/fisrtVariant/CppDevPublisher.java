package com.publisher.fisrtVariant;

import java.util.ArrayList;
import java.util.List;

public class CppDevPublisher extends Publisher {
    public CppDevPublisher() {
        subscribers = new ArrayList<>();
        vacancies = new ArrayList<>();
    }

    public CppDevPublisher(List<Subscriber> subscribers, List<String> vacancies) {
        this.subscribers = subscribers;
        this.vacancies = vacancies;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    protected void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.vacancyNotification(vacancies));
    }

    @Override
    public void addVacancies(List<String> vacancies) {
        this.vacancies.addAll(vacancies);
        notifySubscribers();
    }

    @Override
    void removeVacancy(String vacancy) {
        vacancies.removeIf(vacancy::equalsIgnoreCase);
        notifySubscribers();
    }
}

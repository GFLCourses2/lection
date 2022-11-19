package com.publisher.secondVariant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobSitePublisher implements Publisher {
    private List<String> vacancies;
    private List<Subscriber> subscribers;

    public JobSitePublisher() {
        vacancies = new ArrayList<>();
        subscribers = new ArrayList<>();
    }
    @Override
    public void addVacancy(String vacancy){
        vacancies.add(vacancy);
        notifySubscribers();
    }

    @Override
    public void removeVacancy(String vacancy){
        vacancies.removeIf(vacancy::equalsIgnoreCase);
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.vacancyNotification(vacancies));
    }
}

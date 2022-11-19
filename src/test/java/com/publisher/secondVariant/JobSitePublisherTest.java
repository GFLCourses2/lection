package com.publisher.secondVariant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobSitePublisherTest {
    private Publisher jobSitePublisher;

    @BeforeEach
    void setUp() {
        jobSitePublisher = new JobSitePublisher();
    }

    @Test
    public void vacancyNotification(){
        jobSitePublisher.addVacancy("Junior java developer");
        jobSitePublisher.addVacancy("Middle java developer");
        jobSitePublisher.addSubscriber(new Subscriber("Oleg"));
        jobSitePublisher.addSubscriber(new Subscriber("Alex"));
        jobSitePublisher.addVacancy("Senior java developer");
        System.out.println();
        jobSitePublisher.removeVacancy("junior java developer");
    }
}
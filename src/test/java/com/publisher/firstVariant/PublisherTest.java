package com.publisher.firstVariant;

import com.publisher.fisrtVariant.Recruiter;
import com.publisher.fisrtVariant.Subscriber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PublisherTest {
    private Recruiter recruiter;
    private List<String> javaVacancies;
    private List<String> cppVacancies;

    @BeforeEach
    void setUp() {
        recruiter = new Recruiter();
        javaVacancies = new ArrayList<>(List.of("Junior Java developer","Middle Java developer","Senior Java Developer"));
        cppVacancies= new ArrayList<>(List.of("Junior Cpp developer","Middle Cpp developer","Senior Cpp Developer"));
    }

    @Test
    public void notifySubscribersFirst(){
        recruiter.addSubscriber(new Subscriber("Oleg","java"));
        recruiter.addSubscriber(new Subscriber("Alex","Cpp"));
        recruiter.addJavaVacancies(javaVacancies);
        recruiter.addCppVacancies(cppVacancies);
        System.out.println();
        recruiter.removeJavaVacancy("Junior java developer");
    }
}
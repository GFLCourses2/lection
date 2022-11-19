package com.publisher.fisrtVariant;

import java.util.List;

public class Recruiter {
    private Publisher javaPublisher;
    private Publisher cppPublisher;

    public Recruiter() {
        javaPublisher = new JavaDevPublisher();
        cppPublisher = new CppDevPublisher();
    }

    public void addJavaVacancies(List<String> vacancies){
        javaPublisher.addVacancies(vacancies);
    }

    public void addCppVacancies(List<String> vacancies){
        cppPublisher.addVacancies(vacancies);
    }

    public void removeJavaVacancy(String vacancy){
        javaPublisher.removeVacancy(vacancy);
    }
    public void removeCppVacancy(String vacancy){
        cppPublisher.removeVacancy(vacancy);
    }

    public void addSubscriber(Subscriber subscriber){
        if ("java".equalsIgnoreCase(subscriber.getLanguage())){
            javaPublisher.subscribe(subscriber);
        } else if ("cpp".equalsIgnoreCase(subscriber.getLanguage())){
            cppPublisher.subscribe(subscriber);
        }
    }
}

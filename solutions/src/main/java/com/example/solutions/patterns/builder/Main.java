package com.example.solutions.patterns.builder;

import com.example.solutions.patterns.builder.builders.AutomationBuilder;
import com.example.solutions.patterns.builder.builders.ManualBuilder;
import com.example.solutions.patterns.proxy.proxy.UserServiceProxy;
import com.example.solutions.patterns.proxy.service.OriginalUserService;
import com.example.solutions.patterns.proxy.service.UserService;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        AutomationBuilder autoBuilder = new AutomationBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructAutoUser(autoBuilder);
        BuildUser buildAutoUser = autoBuilder.getBuildUser();

        director.constructManualUser(manualBuilder);
        BuildUser buildManualUser  = manualBuilder.getBuildUser();

        System.out.println(buildAutoUser);
        System.out.println(buildManualUser);
    }
}
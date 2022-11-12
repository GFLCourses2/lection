package com.kozlov_oleksandr;

import com.kozlov_oleksandr.builder.Manager;
import com.kozlov_oleksandr.builder.ManualBuilder;
import com.kozlov_oleksandr.builder.UserBuilder;
import com.kozlov_oleksandr.dto.User;
import com.kozlov_oleksandr.facade.FacadeSingleton;
import com.kozlov_oleksandr.proxy.PrintParamProxy;

public class App {
    public static void main(String[] args){

    }
}

//    User user = new User("kozlov","123", 2L);
//    PrintParamProxy proxy = new PrintParamProxy(user);
//        proxy.print();
//                proxy.toString();


//    main of Facade
//    FacadeSingleton facade = new FacadeSingleton();
//        facade.show();





//    main of Builder
//
//    public static void main(String[] args){
//        UserBuilder autoBuilder = new UserBuilder();
//        ManualBuilder manualBuilder = new ManualBuilder();
//        Manager manager = new Manager();
//
//        manager.constructUser(autoBuilder);
//        User buildUser = autoBuilder.getBuildUser();
//
//        manager.constructManualUser(manualBuilder);
//        User buildManualUser  = manualBuilder.getBuildUser();
//
//        System.out.println(buildUser);
//        System.out.println(buildManualUser);
//    }

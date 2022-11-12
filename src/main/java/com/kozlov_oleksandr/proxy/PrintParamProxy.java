package com.kozlov_oleksandr.proxy;

import com.kozlov_oleksandr.dto.User;

public class PrintParamProxy implements Print{
    private PrintParam param;
    private User user;

    public PrintParamProxy(User user) {
        this.user = user;
    }

    @Override
    public void print() {
        if (param ==null){
            param = new PrintParam(user);
        }
        param.print();
    }
}


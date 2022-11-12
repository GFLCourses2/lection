package com.kozlov_oleksandr.proxy;

import com.kozlov_oleksandr.dto.User;

public class PrintParam implements Print{
    private User user;

    public PrintParam(User user) {
        this.user = user;
        getFromOutSource(user);
    }

    private void getFromOutSource(User user) {
        System.out.println("Proxy "+user.toString());
    }

    @Override
    public void print() {
        System.out.println(user.toString());
    }
}

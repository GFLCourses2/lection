package com.kozlov_oleksandr.facade;

public class FacadeSingleton implements ServiceSingleton{
    @Override
    public void show() {
        FirstSingleton.getInstance();
        SecondSingleton.getInstance();
        ThirdSingleton.getInstance();
    }
}

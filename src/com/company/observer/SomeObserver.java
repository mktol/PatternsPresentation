package com.company.observer;

/**
 * Created by fagim on 07.06.16.
 */
public class SomeObserver implements ISomeObserver{


    @Override
    public void update(){
        System.out.println("Flag changed in subject");
    }

}

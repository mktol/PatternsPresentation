package com.company.observer;

import java.util.ArrayList;

/**
 * Subject
 */
public class Subject implements ISubject{

    private int flag = 1;
    private ArrayList<ISomeObserver> observers = new ArrayList<>();

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObserver();
    }



    @Override
    public void register(SomeObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(SomeObserver observer) {
        observers.remove(observer);
        System.out.println(observers.size());
    }

    @Override
    public void notifyObserver() {
        observers.forEach(item->{item.update();});
    }
}

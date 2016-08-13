package com.company.observer2;

/**
 * Observer implementation
 */
public class ObserverImpl2 implements IObserver{

    @Override
    public void update(String msg, int i) {
        System.out.println("Observer2 : msg is changed to "+msg+", i ---> "+ i);
    }
}

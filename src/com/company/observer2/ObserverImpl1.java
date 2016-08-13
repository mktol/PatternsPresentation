package com.company.observer2;

/**
 * Created by fagim on 13.08.16.
 */
public class ObserverImpl1 implements IObserver {
    @Override
    public void update(String msg, int i) {
        System.out.println("Observer 1: message "+msg+" i = "+i);
    }
}

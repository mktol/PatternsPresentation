package com.company.observer2;

/**
 * Created by fagim on 13.08.16.
 */
public interface ISubject {
    void register(IObserver observer);
    void unregister(IObserver observer);
    void notifyObservers(int i);
}

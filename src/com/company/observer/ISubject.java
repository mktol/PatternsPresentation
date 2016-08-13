package com.company.observer;

/**
 * Created by fagim on 07.06.16.
 */
public interface ISubject {
    void register(SomeObserver observer);
    void unregister(SomeObserver observer);
    void notifyObserver();
}

package com.company.observer2;

import java.util.HashSet;
import java.util.Set;

/**
 * Subject implementation
 */
public class SubjectImpl implements ISubject {

    private int anInt;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
        notifyObservers(anInt);
    }

    private Set<IObserver> observerSet = new HashSet<>();

    @Override
    public void register(IObserver observer) {
        observerSet.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers(int i) {
        observerSet.forEach(observer -> {observer.update("Subject one",i);});
    }
}

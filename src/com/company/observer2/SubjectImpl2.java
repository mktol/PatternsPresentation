package com.company.observer2;

import java.util.HashSet;
import java.util.Set;

/**
 * Subject implementation 2
 */
public class SubjectImpl2 implements  ISubject{
    private int updateValue;
    private Set<IObserver> observerSet  = new HashSet<>();

    public int getUpdateValue() {
        return updateValue;
    }

    public void setUpdateValue(int updateValue) {
        this.updateValue = updateValue;
        notifyObservers(updateValue);
    }

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
        for (IObserver observer : observerSet) {
            observer.update("Subject 2 impl ", i);
        }

    }
}

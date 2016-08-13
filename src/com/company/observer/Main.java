package com.company.observer;


public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        SomeObserver observer1 = new SomeObserver();
        SomeObserver observer2 = new SomeObserver();
        SomeObserver observer3 = new SomeObserver();

        subject.register(observer1);
        subject.register(observer1);
        subject.register(observer3);

        subject.setFlag(900);
        subject.unregister(observer2);
        subject.setFlag(6789);
    }
}

package com.company.observer2;

/**
 * Test observer
 */
public class Main {
    public static void main(String[] args) {
        // initialize observers
        IObserver observer1 = new ObserverImpl1();
        IObserver observer2 = new ObserverImpl2();
        // initialize subjects
        SubjectImpl subject = new SubjectImpl();
        SubjectImpl2 subject1 = new SubjectImpl2();

        // registers observers

        subject.register(observer1);
        subject.register(observer2);

        subject1.register(observer1);
        subject1.register(observer2);

        System.out.println("change int value");
        subject.setAnInt(43); //  something happened
        System.out.println("---------------------------------------");
        subject1.setUpdateValue(56); //

    }
}

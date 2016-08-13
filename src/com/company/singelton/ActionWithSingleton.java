package com.company.singelton;

/**
 * Created by fagim on 13.08.16.
 */
public class ActionWithSingleton implements Runnable {
    private SingletonOne singletonOne = SingletonOne.getInstance();
    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            singletonOne.setAge(i);
        }
    }
}

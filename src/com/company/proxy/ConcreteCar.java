package com.company.proxy;

/**
 * Car implementation.
 */
public class ConcreteCar implements ICar {
    private String goal;

    public ConcreteCar(String goal) {
        this.goal = goal;
    }

    @Override
    public String move() {
        return "my goal is "+ goal;
    }
}

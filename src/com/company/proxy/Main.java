package com.company.proxy;

/**
 * Tst proxy
 */
public class Main {
    public static void main(String[] args) {
        ICar car = new ConcreteCar("Ivano-Frankivsk");
        System.out.println(car.move());

        ICar car1 = new ConcreteCarProxy();
        System.out.println(car1.move());
    }
}

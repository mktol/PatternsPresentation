package com.company.proxy;

/**
 * Tst proxy
 */
public class Main {
    public static void main(String[] args) {
        ICar car = new ConcreteCar("Ivano-Frankivsk");
        printCar(car);

        ICar car1 = new ConcreteCarProxy();
        printCar(car1);
    }
    public static void printCar(ICar car){
        System.out.println(car.move());
    }
}

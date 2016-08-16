package com.company.decorator;

/**
 * Test decorator
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*** Decorator sample ***");
        ConcreteComponent bread = new ConcreteComponent();
        ConcreteDecorator jam = new ConcreteDecorator();
        jam.setComponent(bread);
        jam.doJob();
        System.out.println("*************************");
        ConcreteDecoratorButter butter = new ConcreteDecoratorButter();
        butter.setComponent(jam);
        butter.doJob();
        System.out.println("*************************");
        ConcreteDecoratorMeat meat = new ConcreteDecoratorMeat();
        meat.setComponent(butter);
        meat.doJob();
    }
}

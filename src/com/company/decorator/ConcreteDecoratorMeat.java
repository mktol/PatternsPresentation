package com.company.decorator;

/**
 * Meat decorator
 */
public class ConcreteDecoratorMeat extends AbstractDecorator {
    @Override
    void doJob() {
        super.doJob();
        System.out.println("add meat!!!");
    }
}

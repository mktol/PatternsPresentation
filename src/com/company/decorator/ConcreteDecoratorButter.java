package com.company.decorator;

/**
 * Decorator add butter
 */
public class ConcreteDecoratorButter extends AbstractDecorator{
    @Override
    void doJob() {
        super.doJob();
        System.out.println("add butter!!");
    }
}

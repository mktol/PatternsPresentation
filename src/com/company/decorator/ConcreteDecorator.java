package com.company.decorator;

/**
 * Concrete decorator
 */
public class ConcreteDecorator extends AbstractDecorator {
    @Override
    void doJob() {
        super.doJob();
        System.out.println("Add jam .");
    }
}

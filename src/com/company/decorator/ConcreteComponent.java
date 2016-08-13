package com.company.decorator;

/**
 * Concrete component
 */
public class ConcreteComponent extends Component {
    @Override
    void doJob() {
        System.out.println("Bread");
    }
}

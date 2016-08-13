package com.company.proxy;

/**
 * car proxy example
 */
public class ConcreteCarProxy implements ICar {

    private ConcreteCar concreteCar;

    public ConcreteCarProxy() {
        this.concreteCar = new ConcreteCar("Kiev");
    }

    public ConcreteCar getConcreteCar() {
        return concreteCar;
    }

    public void setConcreteCar(ConcreteCar concreteCar) {
        this.concreteCar = concreteCar;
    }

    @Override
    public String move() {
        String result = concreteCar.move();
        result = "I am Proxy { "+ result + " }";
        return result;
    }
}

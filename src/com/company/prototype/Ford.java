package com.company.prototype;


public class Ford extends BasicCar {
    public Ford(String name) {
        modelName = name;
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (Ford)super.clone();
    }

    @Override
    public String toString() {
        return "Ford{"+modelName+"}";
    }
}

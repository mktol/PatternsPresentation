package com.company.prototype;

/**
 * This class .. //TODO
 *
 * @Author Maksym Tolstik
 */
public class Jaguar extends BasicCar {
    public Jaguar(String name){
        modelName = name;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Jaguar)super.clone();
    }
}

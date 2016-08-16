package com.company.prototype;

import java.util.Random;

/**
 * This class .. //TODO
 *
 * @Author Maksym Tolstik
 */
public class BasicCar implements Cloneable {
    protected String modelName;
    protected int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar)super.clone();
    }

    public int setPrice(){
        Random random = new Random();
        price = random.nextInt(1000);
        return price;
    }
}

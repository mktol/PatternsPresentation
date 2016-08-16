package com.company.prototype;

/**
 * Test prototype
 *
 * @Author Maksym Tolstik
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("*** Test prototype pattern ***");
        BasicCar jag_base = new Jaguar("Green Jaguar");
        jag_base.price = 1001;
        BasicCar ford_base = new Ford("Old Ford Car");
        ford_base.price = 5000;

        BasicCar bs_car =  jag_base.clone();
        BasicCar fd_car = ford_base.clone();

        System.out.println("Car is "+fd_car.price+" and "+bs_car.modelName);


    }
}

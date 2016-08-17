package com.company.factoryMethod;

/**
*
 */
public class Main {



    public static void main(String[] args) {

        try {
            IAnimalFactory animalFactory = new ConcreteFactory();
            IAnimal tiger = animalFactory.getAnimalType("Tiger");
            IAnimal duck = animalFactory.getAnimalType("Duck");

            animalSay(tiger);
            animalSay(duck);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void animalSay(IAnimal animal){
        animal.speak();
    }
}

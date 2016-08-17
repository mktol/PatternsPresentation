package com.company.factoryMethod;

/**
*
 */
public abstract class IAnimalFactory {
    public abstract IAnimal getAnimalType(String type) throws  Exception;
}

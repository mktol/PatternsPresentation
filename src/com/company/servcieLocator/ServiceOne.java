package com.company.servcieLocator;

/**
 * This class .. //TODO
 *
 * @Author Maksym Tolstik
 */
public class ServiceOne implements Service {
    @Override
    public String getName() {
        return "ServiceOne";
    }

    @Override
    public void execute() {
        System.out.println("Execute service one.");
    }
}

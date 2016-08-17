package com.company.servcieLocator;

/**
 * This class .. //TODO
 *
 * @Author Maksym Tolstik
 */
public class ServiceTwo implements Service {
    @Override
    public String getName() {
        return "Service two";
    }

    @Override
    public void execute() {
        System.out.println("Execute service 2");
    }
}

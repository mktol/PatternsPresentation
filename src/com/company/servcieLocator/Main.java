package com.company.servcieLocator;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        ServiceLocator serviceLocator = ServiceLocator.getInstance();
        Service service = serviceLocator.getService("ServiceOne");
        service.execute();
        service = serviceLocator.getService("Service two");
        service.execute();
        service = serviceLocator.getService("ServiceOne");
        service.execute();
        service = serviceLocator.getService("Service two");
        service.execute();
    }
}

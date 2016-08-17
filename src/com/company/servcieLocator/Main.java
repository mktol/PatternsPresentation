package com.company.servcieLocator;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("ServiceOne");
        service.execute();
        service = ServiceLocator.getService("Service two");
        service.execute();
        service = ServiceLocator.getService("ServiceOne");
        service.execute();
        service = ServiceLocator.getService("Service two");
        service.execute();
    }
}

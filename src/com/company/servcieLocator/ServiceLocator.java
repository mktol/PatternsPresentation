package com.company.servcieLocator;

/**
 *
 */
public class ServiceLocator {

    private static ServiceLocator serviceLocator;

    private ServiceLocator() {
    }

    public static ServiceLocator getInstance(){
        if(serviceLocator == null){
            serviceLocator = new ServiceLocator();
        }
        return serviceLocator;
    }

    private  Cache cache = new Cache();

    public  Service getService(String name){
        Service service = cache.getService(name);

        if(service != null){
            return service;
        }

        InitialContext context  = new InitialContext();
        Service service1 = (Service) context.lookup(name);
        cache.addService(service1);
        return service1;
    }


}

package com.company.servcieLocator;

/**
 *
 */
public class ServiceLocator {

    private static Cache cache = new Cache();

    public static Service getService(String name){
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

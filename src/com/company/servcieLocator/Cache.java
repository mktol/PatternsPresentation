package com.company.servcieLocator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class .. //TODO
 *
 * @Author Maksym Tolstik
 */
public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName){
        for (Service service: services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
                break;
            }
        }
        if (!exists){
            services.add(newService);
        }
    }
}

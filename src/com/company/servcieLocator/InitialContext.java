package com.company.servcieLocator;


/**
 * This class .. //TODO
 *
 * @Author Maksym Tolstik
 */
public class InitialContext {
    public Object lookup(String serviceName){
        if(serviceName.equals("ServiceOne")){
            System.out.println("Looking up and creating a new Service 1 object. It take some time");
            try {
                Thread.sleep(2000);
                return new ServiceOne();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if(serviceName.endsWith("Service two")){
            System.out.println("Looking up and creating a new Service 2 object. It take some time");
            try {
                Thread.sleep(3000);
                return new ServiceTwo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

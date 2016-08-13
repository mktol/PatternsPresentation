package com.company.singelton;

/**
 * Main method for testing singleton instances
 */
public class Main {
    private static boolean  flag = false;
    public static void main(String[] args) {
        SingletonOne singletonOne = null;
        System.out.println("Test not thread safe singleton");
        if(flag){
            singletonOne = SingletonOne.getInstance();
        }
        System.out.println("instance is "+singletonOne);
        flag = true;

        if(flag){
            singletonOne = SingletonOne.getInstance();
        }
        System.out.println(singletonOne);

    }
}

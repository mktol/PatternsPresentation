package com.company.singelton;

/**
 * Not thread safe singleton
 */
public class SingletonOne {
    private static SingletonOne singletonOne;
    public String name;
    private int age;
    private SingletonOne(){
        System.out.println("Create instance of singleton.");
    }

    public static SingletonOne getInstance(){
        if(singletonOne==null){
            System.out.println("return existing instance");
            return singletonOne = new SingletonOne(); // lazy initialization
        }
        return singletonOne;
    }

    // some methods


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Im singleton "+name+", age "+age;
    }
}

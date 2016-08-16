package com.company.templateMethod;

/**
 * Template method example
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("**test template methid**");

        BasicEngineering computerScience = new ComputerScience();
        checkDocuments(computerScience);
        BasicEngineering electronics = new Electonics();
        checkDocuments(electronics);

    }

    public static void checkDocuments(BasicEngineering basicEngineering){
        basicEngineering.papers();
    }
}

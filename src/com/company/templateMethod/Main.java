package com.company.templateMethod;

/**
 * Template method example
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("**test template method**");

        BasicEngineering computerScience = new ComputerScience();
        checkDocuments(computerScience);

        System.out.println("**Other faculties**");
        BasicEngineering electronics = new Electonics();
        checkDocuments(electronics);

    }

    public static void checkDocuments(BasicEngineering basicEngineering){
        basicEngineering.papers();
    }
}

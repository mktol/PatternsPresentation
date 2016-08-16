package com.company.builder;

/**
 * Created by fagim on 15.08.16.
 */
public class Main {
    public static void main(String[] args) {
        Creature creature = new Creature.Builder("One head").hands("long heands").legs(4).tail(45).build();
        System.out.println(creature);
    }
}

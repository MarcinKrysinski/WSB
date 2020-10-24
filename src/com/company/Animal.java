package com.company;

import java.io.File;

public class Animal {

    String species;
    String name;
    Double weight;
    Boolean isAlive = true;
    File pic;


    public Animal() {
    }

    public Animal(String species, String name, Double weight, File pic) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.pic = pic;
    }

    public Animal(String species, String name, Double weight, Boolean isAlive) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.isAlive = isAlive;
    }

    void feed(){
        weight += 2;
        System.out.println("feed: " + weight);
    }

    void takeForAWalk(){
        weight -= 3;
        System.out.println("walk: " + weight);
    }

    boolean die(){
        System.out.println("Reksio is dead!");
        return isAlive = false;
    }

}

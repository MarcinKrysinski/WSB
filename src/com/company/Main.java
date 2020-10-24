package com.company;


public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Chow chow", "Reksio", 8.00, true);

        while (dog.isAlive) {
            dog.takeForAWalk();
            if (dog.weight < 6 && dog.weight > 4) {
                dog.feed();
            } else if (dog.weight < 4) {
                dog.die();
            }
        }
    }
}

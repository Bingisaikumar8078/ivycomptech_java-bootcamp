package com.ivycomptech.Day7;

import com.ivycomptech.Omnivores;

public class Driver {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal herbivores = new Herbivores();
        Animal carnivores = new Carnivores();
        Animal omnivores = new Omnivores();
        animal.eats();
        herbivores.eats();
        carnivores.eats();
        omnivores.eats();
    }
}

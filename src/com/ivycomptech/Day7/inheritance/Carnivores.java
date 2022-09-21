package com.ivycomptech.Day7.inheritance;

public class Carnivores extends Animal {
    @Override
    public void eats() {
        System.out.println("Carnivores animals eat only other animals");
    }
}

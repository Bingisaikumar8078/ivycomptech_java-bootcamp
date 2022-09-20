package com.ivycomptech.Day5.Duck;

public class MallardDuck implements Flyable,Swimable,Noise,Walkable{
    @Override
    public void fly() {
        System.out.println("flying");
    }


    public void makeNoise() {
        System.out.println("making noise");
    }


    public void swim() {
        System.out.println("swimming...");
    }


    public void walk() {
        System.out.println("Walking....");
    }
}
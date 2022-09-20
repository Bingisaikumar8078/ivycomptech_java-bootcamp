package com.ivycomptech.Day6.inheritence;

public class InheritanceDriver {
    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();
        GrandFather father = new Father();
        GrandFather son = new Son();
        grandFather.swim();
        father.swim();
        son.swim();


    }
}

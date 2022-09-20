package com.ivycomptech.Day6.overloading;

public class OverLoadingDriver {
    public static void main(String[] args) {
        AreaFinder areafinder = new AreaFinder();
        System.out.println("SQUARE AREA IS: " + areafinder.area(5));
        System.out.println("CIRCLE  AREA IS: " + areafinder.area(5.12));
        System.out.println("RECTANGLE  AREA IS: " + areafinder.area(5, 6));
    }
}

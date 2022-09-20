package com.ivycomptech.Day6.overloading;

public class AreaFinder {

   public double area(double r) {
        return (22 * r * r) / 7;
    }

   public int area(int x) {
        return (int) Math.pow(x, 2);

    }

   public int area(int x, int y) {
        return x * y;
    }
}

package com.ivycomptech.Day5.Addition;

public class Solution {
    public static void main(String[] args) {
        Adder sum = new Adder();
        sum.callAdd(2,3);
        System.out.println("My superclass is "+sum.getClass().getSuperclass());
    }

}

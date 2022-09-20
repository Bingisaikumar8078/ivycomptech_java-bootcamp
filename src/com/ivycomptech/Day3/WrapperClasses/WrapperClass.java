package com.ivycomptech.Day3.WrapperClasses;
//Convert Primitive Type to Wrapper Objects (boxing/autoboxing)
// For the following:
// int a = 9;
//  double d = 6.78;
//and check if they are converted to wrapper classes
// Sample output:
// An object of Integer is created.
//  An object of Double is created.


public class WrapperClass {
    public static void main(String[] args) {
        int a = 9;
        double d = 6.78;
        //boxing/autoboxing
        Integer s = a;
        Double t = d;


        System.out.println(s.getClass());
        System.out.println(t.getClass());

        if (s instanceof Integer)
            System.out.println("An object of Integer is created");
        else
            System.out.println("it is a primtive int type");
        if (t instanceof Double)
            System.out.println("An object of Double is created");
        else
            System.out.println(" it is a primitive double type");


    }
}

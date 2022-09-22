package com.ivycomptech.Day7.Holiday;

public class HolidayDriver {
    public static void main(String[] args)
    {
        Holiday hol = new Holiday("Independence Day", 4, "July");
        Holiday hol1 = new Holiday("new year Day", 1, "July");
        System.out.println(hol.inSameMonth(hol1));
    }














}

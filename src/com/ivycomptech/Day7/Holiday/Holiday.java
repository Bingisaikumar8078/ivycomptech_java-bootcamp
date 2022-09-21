package com.ivycomptech.Day7.Holiday;

public class Holiday {

    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean inSameMonth(Holiday holiday){
        return this.month.equals(holiday.month);
    }
    public static double avgDate(Holiday[] hol){
        int sum=0;
        for(int i=0;i< hol.length;i++){
            sum=sum+hol[i].day;
        }
        return ((double)sum/ hol.length);
    }


}

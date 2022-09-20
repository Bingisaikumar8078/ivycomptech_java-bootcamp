package com.ivycomptech.Day2.StringProblems;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Mike Royko";
        boolean a = str1.equals(str2);
        boolean b = str1.equals(str3);
        System.out.println("\"" + str1 + "\" equals \"" +
                str2 + "\"? " + a);
        System.out.println("\"" + str1 + "\" equals \"" +
                str3 + "\"? " + b);


    }
}

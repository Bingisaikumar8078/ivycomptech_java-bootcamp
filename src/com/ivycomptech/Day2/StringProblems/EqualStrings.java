package com.ivycomptech.Day2.StringProblems;

import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        System.out.println("Enter String One");
        String str1=new Scanner(System.in).nextLine();
        System.out.println("Enter String Two");
        String str2=new Scanner(System.in).nextLine();
        System.out.println(str1.equals(str2)?"they are Equal":"They are not Equal");
    }
}

package com.ivycomptech.Day2;
import  java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Digit");
        int dig= scanner.nextInt();
        int reverse=0;
        while(dig != 0)
        {
            int remainder = dig % 10;
            reverse = reverse * 10 + remainder;
            dig = dig/10;
        }
        System.out.println(reverse);
    }
}

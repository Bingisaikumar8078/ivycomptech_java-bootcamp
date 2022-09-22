package com.ivycomptech.Day8.Cakes;

import com.ivycomptech.Day8.Cakes.CakeProblem;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length;i++)
            array[i] = sc.nextInt();
        CakeProblem candles= new CakeProblem();
        candles.birthdayCakeCandles(array,length);
    }
}

package com.ivycomptech.Day7.MagicSquare;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length= sc.nextInt();
        int[][] array = new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                array[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        MagicSquare magicSquare = new MagicSquare();
        magicSquare.sqaure(array,length);


    }
}

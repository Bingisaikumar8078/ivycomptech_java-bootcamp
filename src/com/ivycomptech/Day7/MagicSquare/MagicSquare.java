package com.ivycomptech.Day7.MagicSquare;

public class MagicSquare {
    public void sqaure(int[][] array, int length) {
        int diag1 = 0;
        int diag2 = 0;
        int i;
        int j;
        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                if (i == j) {
                    diag1 += array[i][j];
                }
                if (i + j + 1 == length) {

                    diag2 += array[i][j];
                }
            }
        }
        if (diag1 == diag2) System.out.println("Yes");
        else System.out.println("No");
    }
}

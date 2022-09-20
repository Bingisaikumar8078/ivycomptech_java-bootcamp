package com.ivycomptech.Day2;

public class SumOf2DArray {
    public static void main(String[] args) {
        int rows=2;
        int cols=2;
        int[][] arr1 = { { 1, 2 }, { 3, 4 },{4,5},{6,7} };
        int[][] arr2 = { { 2,1 }, { 4,3 },{5,4},{7,6} };
        int[][] arr3 = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];

            }
        }
//printing with normal for
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                System.out.print(arr3[i][j]+" ");
//
//            }
//            System.out.println();
//
//        }
// printing with enhanced for loop
        for(int[] row:arr3){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }


    }
}

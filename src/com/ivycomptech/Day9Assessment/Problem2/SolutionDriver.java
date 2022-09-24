package com.ivycomptech.Day9Assessment.Problem2;

import java.util.Scanner;

public class SolutionDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght of array");
        int n = scanner.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];
        System.out.println("Enter gas array");
        for(int i=0;i<n;i++){
            gas[i]=scanner.nextInt();
        }System.out.println("Enter cost array");
        for(int i=0;i<n;i++){
            cost[i]=scanner.nextInt();
        }
        GasStation gasStation = new GasStation();
        System.out.println(gasStation.circuit(gas,cost));
    }
}

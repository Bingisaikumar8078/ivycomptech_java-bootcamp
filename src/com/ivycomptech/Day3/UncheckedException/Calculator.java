package com.ivycomptech.Day3.UncheckedException;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        char opt = sc.next().charAt(0);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double result;


        switch (opt) {
            case '+':result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case '-': result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case '*': result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case '/':
                try {
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);

                }

                catch (ArithmeticException e){
                    System.out.println("Cannot / by Zero"+e);
                }
            default:
                System.out.println("Invalid operator!");
                break;
        }




    }
}


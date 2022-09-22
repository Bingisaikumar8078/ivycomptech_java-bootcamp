package com.ivycomptech.Day8.Pages;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalpages = sc.nextInt();
        int pageNo = sc.nextInt();
        Pages page = new Pages();
        System.out.println(page.pageCount(totalpages,pageNo));
    }
}

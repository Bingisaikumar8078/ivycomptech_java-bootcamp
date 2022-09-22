package com.ivycomptech.Day8;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String value ="1";
        for(int i=0;i<n;i++){
            char c = value.charAt(0);
            StringBuilder s = new StringBuilder();
            int count=1;
            for(int j=1;j<value.length();j++){
                if(c!=value.charAt(j)){
                    s.append(count);
                    s.append(c);
                    count=0;
                    c=value.charAt(j);
                }
                count++;
            }
        s.append(count);
            s.append(c);

        }
        value.toString();


        System.out.println(value);
    }
}

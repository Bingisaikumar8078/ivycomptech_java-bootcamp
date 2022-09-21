package com.ivycomptech.Day7.Euro;

public class Driver {
    public static void main(String[] args) {
        Euro teneuros = new Euro(10);
        Euro otherteneuros = new Euro(10);
        Euro fiveeuros = new Euro(5);
        Euro twoeuros = new Euro(2);
        Euro seveneuros = new Euro(7);
        System.out.println((fiveeuros.sum(twoeuros)).equals(seveneuros));
        System.out.println(teneuros.equals(otherteneuros));

    }
}

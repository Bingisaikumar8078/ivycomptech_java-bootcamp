package com.ivycomptech.Day9Assessment.Problem3;

import java.util.ArrayList;
import java.util.Random;

public class Bingo {

    static Random randomB = new Random();
    static Random randomI = new Random();
    static Random randomN = new Random();
    static Random randomG = new Random();
    static Random randomO = new Random();
    static ArrayList<Integer> B = new ArrayList<>();
    static ArrayList<Integer> I = new ArrayList<>();

    static ArrayList<Integer> N = new ArrayList<>();
    static ArrayList<Integer> G = new ArrayList<>();
    static ArrayList<Integer> O = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("B  | I  | N | G  | O | ");
        int[][] board = new int[5][5];


        for (int b = 1; b <= 15; b++) {
            int randomb = randomB.nextInt(15 - 1) + 1;
            if (dupCheck(B, randomb)) {
                B.add(randomb);
            }

        }
        for (int i = 16; i <= 30; i++) {
            int randomi = randomI.nextInt(30 - 16) + 16;
            if (dupCheck(I, randomi)) {
                I.add(randomi);
            }
        }
        for (int n = 31; n <= 45; n++) {
            int randomn = randomN.nextInt(45 - 31) + 31;
            if (dupCheck(N, randomn)) {
                N.add(randomn);
            }
        }
        for (int g= 46; g<= 60; g++) {
            int randomg = randomG.nextInt(60 - 46) + 46;
            if (dupCheck(G, randomg)) {
                G.add(randomg);
            }
        }
        for (int o= 61; o<= 75; o++) {
            int randomo = randomO.nextInt(75 - 61) + 61;
            if (dupCheck(O, randomo)) {
                O.add(randomo);
            }
        }
        boardDisplay(board);


    }

    public static void boardDisplay(int[][] board) {
        for (int i = 0; i < board.length; i++) {

            System.out.print(B.get(i) + " | ");
            System.out.print(I.get(i) + " | ");
            System.out.print(N.get(i) + " | ");
            System.out.print(G.get(i) + " | ");
            System.out.print(O.get(i) + " | ");
            System.out.println("\n");
        }
    }

    private static boolean dupCheck(ArrayList<Integer> box, int randomi) {
        for (Integer integer : box) {
            if (integer == randomi)
                return false;

        }
        return true;
    }
    }


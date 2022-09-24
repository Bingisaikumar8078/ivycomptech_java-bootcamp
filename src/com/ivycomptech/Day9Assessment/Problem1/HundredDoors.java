package com.ivycomptech.Day9Assessment.Problem1;

public class HundredDoors {
    public void doorState(int n) {

        boolean[] doors = new boolean[101];
//        Arrays.fill(doors, FALSE);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j += i) {
                {

                    doors[j] = !doors[j];
                }
            }
        }

        for (int i = 1; i <= n; i++) {

            if (doors[i]) {
                System.out.print("@");
            } else {
                System.out.print("#");
            }
        }
    }


}

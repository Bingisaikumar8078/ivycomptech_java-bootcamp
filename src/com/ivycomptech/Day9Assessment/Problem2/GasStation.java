package com.ivycomptech.Day9Assessment.Problem2;

public class GasStation {
    public int circuit(int[] gas, int[] cost){
        int position=0;
        int sum=0;
        int total=0;
//        gas - 1   2   3   4    5
//        cost -3   4   5   1     2
//    gas-cost  -2  -2  -2   3    3


//         gas - 2   3   4
//         cost- 3   4    3
//    gas-cost  - -1  -1   1
        for(int i=0;i<gas.length;i++){
            //here sum is gas- cost
            sum+=gas[i]-cost[i];
            // if sum is less than 0 we move it into total we loose fuel,
            // and cant take this point
            if(sum<0){
                total+=sum;
                sum=0;
                //we move to the next index here
                position= i+1;
            }
        }
        total+=sum;
        if(total>=0)
            return position;
        else
            return -1;
    }
}

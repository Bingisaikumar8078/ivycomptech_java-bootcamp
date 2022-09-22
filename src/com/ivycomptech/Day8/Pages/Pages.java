package com.ivycomptech.Day8.Pages;

public class Pages {
    public int pageCount(int totalpasges , int pageNo){
        //9
        //4
        //1 2,3 4,5 6,7 8,9 front
        // 9,8 7,6 4,5 3,2 1 back
        int fromfront = pageNo/2;
        int fromback = totalpasges/2-pageNo/2;
        return Math.min(fromfront,fromback);


    }
}

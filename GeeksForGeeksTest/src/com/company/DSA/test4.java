package com.company.DSA;

import java.util.ArrayList;

public class test4 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        /*test(arr,5);

        for(int a: arr){
            System.out.println(a);
        }*/

        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1==i2);
    }

    public static void test(ArrayList<Integer> arr, int a ){
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1 = (ArrayList<Integer>) arr.clone();
        arr1.add(50);
        a--;
        if(a<=0){
            return;
        }else {
            test(arr1,1);
        }
    }

}

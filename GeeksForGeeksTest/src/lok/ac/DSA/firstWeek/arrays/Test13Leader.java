package lok.ac.DSA.firstWeek.arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Lokesh Sharma on 08-06-2019.
 */


/*

Given an array of positive integers. Your task is to find the leaders in the array.

Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader.
 */

public class Test13Leader {

    public static void main(String[] args) {

    }


    static ArrayList<Integer> leaders(int arr[], int n){

        // Your code here


        /******************
         * You just need to complete this
         * function and return the vector
         * containing the leaders.
         * ***************/


        ArrayList<Integer> list = new ArrayList<Integer>();

        int max = arr[n-1];

        for(int i = n-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                list.add(max);
            }
        }

        Collections.reverse(list);

        return list;

    }
}

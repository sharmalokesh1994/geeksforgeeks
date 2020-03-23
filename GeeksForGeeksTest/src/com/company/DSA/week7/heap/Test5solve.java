package com.company.DSA.week7.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
**********************************************
Kth smallest element
* ********************************************
 */

/*
Given an array arr[] of N positive integers and a number K. The task is to find the kth smallest element in the array.
 */

public class Test5solve {

    public static int kthSmallest(int arr[], int n, int k){
        // Your code here


        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0;i<k;i++){
            pQueue.add(arr[i]);
        }

        for(int i = k; i<n;i++){
            int t = pQueue.peek();

            if(t>arr[i]){

                pQueue.remove(t);
                pQueue.add(arr[i]);

            }

        }

        return pQueue.peek();

    }

}
package com.company.DSA.week7.heap;

/*
********************************************
Kth largest element
* *******************************************
 */
/*
Given an array arr[] of N positive integers and a number K. The task is to find the kth largest element in the array.
 */

import java.util.PriorityQueue;

public class Test4solve {
    public static int KthLargest(int arr[], int n, int k){
        // Your code here

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for(int i=0;i<k;i++){
            pQueue.add(arr[i]);
        }

        for(int i = k; i<n;i++){
            int t = pQueue.peek();

            if(t<arr[i]){

                pQueue.remove(t);
                pQueue.add(arr[i]);

            }

        }

        return pQueue.peek();

    }
}
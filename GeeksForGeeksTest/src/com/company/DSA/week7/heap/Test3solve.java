package com.company.DSA.week7.heap;

/*
*********************************************
k largest elements
* *******************************************
 */

/*
Given an array of N positive integers, print k largest elements from the array.  The output elements should be printed in decreasing order.
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test3solve {

    public static void kthLargest(int arr[], int n, int k){
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

        int arr1[] = new int[k];
        int i=0;
        for(int a : pQueue){
            arr1[i++] = a;
        }

        Arrays.sort(arr1);
        i=k-1;
        for( ;i>=0;i--){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

    }
}
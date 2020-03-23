package com.company.DSA.week7.heap;

import java.util.PriorityQueue;

/*
*****************************************************
Kth largest element in a stream
* ***************************************************
 */

/*
Given an input stream of n integers, find the kth largest element for each element in the stream.
 */

public class Test6solve {

    public void kthLargest(int arr[], int n, int k){
        // Your code here

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for(int i=0;i<k;i++){
            pQueue.add(arr[i]);
        }

        int arr1[] = new int[n-k+1];

        int j = 0;
        arr1[j++]=pQueue.peek();

        for(int i = k; i<n;i++){
            int t = pQueue.peek();

            if(t<arr[i]){

                pQueue.remove(t);
                pQueue.add(arr[i]);

            }
            arr1[j++]=pQueue.peek();

        }

        for(int i=1;i<k;i++){
            System.out.print(-1+" ");
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();



    }
}